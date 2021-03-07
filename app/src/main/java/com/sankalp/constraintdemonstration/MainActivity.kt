package com.sankalp.constraintdemonstration

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var tv_b1 : TextView
    lateinit var tv_b2 : TextView
    lateinit var tv_b3 : TextView
    lateinit var tv_b4 : TextView
    lateinit var tv_b5 : TextView
    lateinit var constraintLayout: ConstraintLayout
    lateinit var btn_red : Button
    lateinit var btn_yellow : Button
    lateinit var btn_green : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_b1 = findViewById(R.id.textBox1)
        tv_b2 = findViewById(R.id.textBox2)
        tv_b3 = findViewById(R.id.textBox3)
        tv_b4 = findViewById(R.id.textBox4)
        tv_b5 = findViewById(R.id.textBox5)
        constraintLayout = findViewById(R.id.constraintLayout)
        btn_red = findViewById(R.id.red_button)
        btn_yellow = findViewById(R.id.yellow_button)
        btn_green = findViewById(R.id.green_button)
        setListener()

    }
    private fun setListener(){
        val clickableViews: List<View> = listOf(tv_b1, tv_b2, tv_b3, tv_b4, tv_b5, constraintLayout, btn_red, btn_yellow, btn_green)
        for (items in clickableViews){
             items.setOnClickListener{
                 makeColoured(it)}
        }
    }
    private fun makeColoured(view: View){
        when(view.id){
            // Boxes using Color class colors for background
            R.id.textBox1 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.textBox2 -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.textBox3 -> view.setBackgroundResource(R.color.green)
            R.id.textBox4 -> view.setBackgroundResource(R.color.green)
            R.id.textBox5 -> view.setBackgroundResource(R.color.green)

            R.id.red_button -> tv_b3.setBackgroundResource(R.color.red)
            R.id.yellow_button -> tv_b4.setBackgroundResource(R.color.yellow)
            R.id.green_button -> tv_b5.setBackgroundResource(R.color.light_green)

            else -> view.setBackgroundResource(R.color.teal_700)
        }
    }
}