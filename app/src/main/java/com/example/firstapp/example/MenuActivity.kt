package com.example.firstapp.example

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstapp.R
import com.example.firstapp.example.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnSaludar = findViewById<AppCompatButton>(R.id.btnSaludarApp)
        btnSaludar.setOnClickListener { navigateToSaludar() }

        val btnImc = findViewById<AppCompatButton>(R.id.btnImcApp)
        btnImc.setOnClickListener { navigateToImcApp() }
    }

    fun navigateToImcApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }
    fun navigateToSaludar() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}