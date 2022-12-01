package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zero = findViewById<Button>(R.id.zero)
        val one = findViewById<Button>(R.id.one)
        val two = findViewById<Button>(R.id.two)
        val three = findViewById<Button>(R.id.three)
        val four = findViewById<Button>(R.id.four)
        val five = findViewById<Button>(R.id.five)
        val six = findViewById<Button>(R.id.six)
        val seven = findViewById<Button>(R.id.seven)
        val eight = findViewById<Button>(R.id.eight)
        val nine = findViewById<Button>(R.id.nine)
        val result = findViewById<TextView>(R.id.textViewRisultato)

        zero.setOnClickListener{
            val zeroNum=0
            val zeroString=zeroNum.toString()
            result.text= getString(R.string.zero)
        }

        one.setOnClickListener{
            val oneNum=1
            val oneString=oneNum.toString()
            result.text= getString(R.string.one)
        }

        two.setOnClickListener{
            val twoNum=2
            val twoString=twoNum.toString()
            result.text= getString(R.string.two)
        }

        three.setOnClickListener{
            val threeNum=3
            val threeString=threeNum.toString()
            result.text= getString(R.string.three)
        }

        four.setOnClickListener{
            val fourNum=4
            val fourString=fourNum.toString()
            result.text= getString(R.string.four)
        }

        five.setOnClickListener{
            val fiveNum=5
            val fiveString=fiveNum.toString()
            result.text= getString(R.string.five)
        }

        six.setOnClickListener{
            val sixNum=6
            val sixString=sixNum.toString()
            result.text= getString(R.string.six)
        }

        seven.setOnClickListener{
            val sevenNum=7
            val sevenString=sevenNum.toString()
            result.text= getString(R.string.three)
        }

        eight.setOnClickListener{
            val eightNum=8
            val eightString=eightNum.toString()
            result.text= getString(R.string.eight)
        }

        nine.setOnClickListener{
            val nineNum=9
            val nineString=nineNum.toString()
            result.text= getString(R.string.nine)
        }



    }
}