package com.example.coffeeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quantityEditText = findViewById<EditText>(R.id.quantity)
        val creamCheckBox = findViewById<CheckBox>(R.id.cream_checkbox)
        val sugarCheckBox = findViewById<CheckBox>(R.id.sugar_checkbox)
        val orderButton = findViewById<Button>(R.id.order_button)

        orderButton.setOnClickListener {
            val quantity = quantityEditText.text.toString().toIntOrNull()
            if (quantity == null || quantity <= 0) {
                Toast.makeText(this, "Please enter a valid quantity", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val hasCream = creamCheckBox.isChecked
            val hasSugar = sugarCheckBox.isChecked

            val pricePerCup = 5 // Basic coffee price
            val totalPrice = calculateTotalPrice(quantity, hasCream, hasSugar, pricePerCup)

            val summary = createOrderSummary(quantity, hasCream, hasSugar, totalPrice)
            val intent = Intent(this, SummaryActivity::class.java).apply {
                putExtra("ORDER_SUMMARY", summary)
            }
            startActivity(intent)
        }
    }

    private fun calculateTotalPrice(quantity: Int, hasCream: Boolean, hasSugar: Boolean, pricePerCup: Int): Int {
        var totalPrice = quantity * pricePerCup
        if (hasCream) totalPrice += quantity * 1 // Extra $1 for cream
        if (hasSugar) totalPrice += quantity * 1 // Extra $1 for sugar
        return totalPrice
    }

    private fun createOrderSummary(quantity: Int, hasCream: Boolean, hasSugar: Boolean, totalPrice: Int): String {
        return """
            Order Summary:
            Quantity: $quantity
            Cream: ${if (hasCream) "Yes" else "No"}
            Sugar: ${if (hasSugar) "Yes" else "No"}
            Total Price: $${totalPrice}
            Thank you for your order!
        """.trimIndent()
    }
}