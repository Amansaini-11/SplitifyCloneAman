package com.example.splitifycloneaman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HomeScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)

        var showExpensesbtn = findViewById<CardView>(R.id.cw_showExpenses)

        showExpensesbtn.setOnClickListener(){
            val i  = Intent(this, ShowExpensesActivity::class.java)
            startActivity(i)
        }
    }
}