package com.example.splitifycloneaman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class GroupExppensesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_exppenses)

        val backButton = findViewById<Button>(R.id.backbutton)
        backButton.setOnClickListener{
            onBackPressed()
        }

        var expenseHistorybtn = findViewById<CardView>(R.id.cw_expenseHistory)

        expenseHistorybtn.setOnClickListener(){
            val l  = Intent(this, ExpenseHistoryActivity::class.java)
            startActivity(l)
        }

    }
}