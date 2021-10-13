package com.mybutton.backgroundchanger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var background =findViewById<ConstraintLayout>(R.id.truecolors)

        var clickmore=findViewById<Button>(R.id.thinkclick)
        var dalag=findViewById<Button>(R.id.yellowButton)
        var sky=findViewById<Button>(R.id.blueButton)
        var leaves=findViewById<Button>(R.id.greenButton)
        var hollow=findViewById<Button>(R.id.blackButton)
        var brownes=findViewById<Button>(R.id.brownButton)
        var cetrus=findViewById<Button>(R.id.orangeButton)
        var dako=findViewById<Button>(R.id.increaseButton)
        var gamay=findViewById<Button>(R.id.decreaseButton)
        var hubcode=findViewById<TextView>(R.id.codehub)

        var increaments =0



        clickmore.setOnClickListener{
            Toast.makeText(applicationContext,"HARRIS REVELO", Toast.LENGTH_SHORT).show()
        }
        dalag.setOnClickListener{
            background.setBackgroundResource(R.color.yellow)
        }
        sky.setOnClickListener{
            background.setBackgroundResource(R.color.blue)
        }

        leaves.setOnClickListener{
            background.setBackgroundResource(R.color.green)
        }

        hollow.setOnClickListener{
            background.setBackgroundResource(R.color.black)
        }

        brownes.setOnClickListener{
            background.setBackgroundResource(R.color.brown)
        }

        cetrus.setOnClickListener{
            background.setBackgroundResource(R.color.orange)
        }


    // counter logic
        dako.setOnClickListener{
            increaments+=1
            hubcode.text=increaments.toString()
        }
        gamay.setOnClickListener{
            increaments-=1
            hubcode.text=increaments.toString()
        }


    }
}