package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_play.setOnClickListener {

            val intent = Intent(applicationContext, ResultActivity:: class.java)

            //Gerar número aleatório
            val number = Random().nextInt(2)

            //Enviar número para outra activity
            intent.putExtra("number", number)

            startActivity(intent)

        }

    }
}