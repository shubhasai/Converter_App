package `in`.vikins.coverterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var rdgrp:RadioGroup
    lateinit var ttl:String
    lateinit var opr:String
    lateinit var nxtbtn:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rdgrp = findViewById(R.id.radioGroup)
        nxtbtn = findViewById(R.id.next)
        nxtbtn.setOnClickListener {
            when(rdgrp!!.checkedRadioButtonId){
                R.id.radioButton->{
                    opr = "area"
                    ttl = "Area"
                    startactivity()

                }
                R.id.radioButton2->{
                    opr = "height"
                    ttl = "Height"
                    startactivity()
                }
                R.id.radioButton3->{
                    opr = "weight"
                    ttl = "Weight"
                    startactivity()
                }
                R.id.radioButton4->{
                    opr = "volume"
                    ttl = "Volume"
                    startactivity()
                }
                R.id.radioButton5->{
                    opr = "speed"
                    ttl = "Speed"
                    startactivity()
                }
            }
        }

    }
    fun startactivity(){
        val intent = Intent(this,Calculation::class.java)
        intent.putExtra("Title",ttl)
        intent.putExtra("operation",opr)
        startActivity(intent)
    }
}