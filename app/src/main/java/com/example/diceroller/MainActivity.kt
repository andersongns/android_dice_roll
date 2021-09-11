package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultText: ImageView = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.btn_roll)

        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            resultText.setImageResource(getDice(rollDice()))
        }
    }
}

fun rollDice (): Int {
    return Random.nextInt(6) + 1
}

fun getDice (number: Int): Int {
   return when (number) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else  -> R.drawable.dice_6
    }
}