package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherapp.databinding.ActivitySignUpBinding
import com.example.weatherapp.helper.User
import com.example.weatherapp.service.UserService
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var userService:UserService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        userService = UserService()
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    
        firebaseAuth = FirebaseAuth.getInstance()

        binding.backButton.setOnClickListener {
            val intent =Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

        binding.submitButton.setOnClickListener {
            val email = binding.username.text.toString()
            val pass = binding.createpassword.text.toString()
            val confirmPass = binding.confirmpassword.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()){
                if(pass == confirmPass){

                    val newUser = User(email,pass)
                    val result = userService.addUser(email,newUser)
                //    firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener {
                        print(result)
                        if(result){
                            val intent = Intent(this,LoginActivity::class.java)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
                    }
                  //  }

                }else{
                    Toast.makeText(this,"Password is not matching",Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this,"Empty Feild",Toast.LENGTH_SHORT).show()
            }
        }

    }
}