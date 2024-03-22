package com.example.splitifycloneaman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class ShowExpensesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_expenses)

        val PersonalExpensebtn = findViewById<CardView>(R.id.cw_personalExpenses)

        PersonalExpensebtn.setOnClickListener(){
            val j = Intent(this , PersonalExpenseActivity::class.java)
            startActivity(j)
        }

        val groupExpensesbtn = findViewById<CardView>(R.id.cw_groupExpenses)

        groupExpensesbtn.setOnClickListener(){
            val k = Intent(this , GroupExppensesActivity::class.java)
            startActivity(k)
        }


        val backButton = findViewById<Button>(R.id.backbutton)
        backButton.setOnClickListener{
            onBackPressed()
        }
    }
}