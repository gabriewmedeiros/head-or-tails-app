package com.example.caraoucoroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val data: Bundle = intent.extras!!
        val number = data.getInt("number")

        if(number == 0) {
            image_result.setImageResource(R.drawable.moeda_cara)
        } else {
            image_result.setImageResource(R.drawable.moeda_coroa)
        }

        imageButton_back.setOnClickListener {

            finish()
        }

    }
}