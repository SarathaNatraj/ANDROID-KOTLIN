package com.example.coffeeapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SummaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        val summaryTextView = findViewById<TextView>(R.id.order_summary)
        val orderSummary = intent.getStringExtra("ORDER_SUMMARY")
        summaryTextView.text = orderSummary
    }
}