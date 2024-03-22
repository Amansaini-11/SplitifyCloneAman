package com.example.splitifycloneaman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExpenseHistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense_history)

        val backButton = findViewById<Button>(R.id.backbutton)
        backButton.setOnClickListener{
            onBackPressed()
        }


    }
}