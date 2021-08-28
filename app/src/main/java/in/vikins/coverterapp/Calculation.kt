package `in`.vikins.coverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import org.w3c.dom.Text

class Calculation : AppCompatActivity() {
    lateinit var ttltxtview:TextView
    lateinit var result:ImageButton
    lateinit var result2:ImageButton
    lateinit var txtview1:TextView
    lateinit var txtview2:TextView
    lateinit var txtview3:TextView
    lateinit var txtview4:TextView
    lateinit var edttxt1:EditText
    lateinit var edttxt2:EditText
    var input1:Float = 0.0f
    var input2:Float = 0.0f
    var res1:Double = 0.0
    var res2:Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculation)
        var title = intent.getStringExtra("Title")
        ttltxtview = findViewById(R.id.textView)
        txtview3 = findViewById(R.id.textView3)
        txtview4 = findViewById(R.id.textView4)
        edttxt1 = findViewById(R.id.ettxt1)
        edttxt2 = findViewById(R.id.ettxt2)
        result = findViewById(R.id.cal1)
        result2 = findViewById(R.id.cal2)
        txtview1 = findViewById(R.id.Txtview1)
        txtview2 = findViewById(R.id.Txtview2)
        ttltxtview.text = title
        when(intent.getStringExtra("operation")){
            "area"->{
                txtview3.text = "Sq.Ft->Sq.m"
                txtview4.text = "Sq.m->Sq.Ft"
                result.setOnClickListener{
                    var str = edttxt1.text.toString()
                    input1 = str.toFloat()
                   res1 = area(input1)
                    txtview1.text = res1.toString()
                }
                result2.setOnClickListener {
                    var str2 = edttxt2.text.toString()
                    input2 = str2.toFloat()
                    res2 = area2(input2)
                    txtview2.text = res2.toString()
                }

            }
            "height"->{
                txtview3.text = "Ft->M"
                txtview4.text = "M->Ft"
                result.setOnClickListener{
                    var str = edttxt1.text.toString()
                    input1 = str.toFloat()
                    res1 = height(input1)
                    txtview1.text = res1.toString()
                }
                result2.setOnClickListener {
                    var str2 = edttxt2.text.toString()
                    input2 = str2.toFloat()
                    res2 = height2(input1)
                    txtview2.text = res2.toString()
                }
            }
            "weight"->{
                txtview3.text = "Kg->Pound"
                txtview4.text = "Pound->Kg"
                result.setOnClickListener{
                    var str = edttxt1.text.toString()
                    input1 = str.toFloat()
                    res1 = weight(input1)
                    txtview1.text = res1.toString()
                }
                result2.setOnClickListener {
                    var str2 = edttxt2.text.toString()
                    input2 = str2.toFloat()
                   res2 = weight2(input2)
                    txtview2.text = res2.toString()
                }
            }
            "volume"->{
                txtview3.text = "L>m^3"
                txtview4.text = "m^3->L"
                result.setOnClickListener{
                    var str = edttxt1.text.toString()
                    input1 = str.toFloat()
                    res1 = volume(input1)
                    txtview1.text = res1.toString()
                }
                result2.setOnClickListener {
                    var str2 = edttxt2.text.toString()
                    input2 = str2.toFloat()
                    res2 = volume2(input2)
                    txtview2.text = res2.toString()
                }
            }
            "speed"->{
                txtview3.text = "Km/hr->M/s"
                txtview4.text = "M/s->Km/hr"
                result.setOnClickListener{
                    var str = edttxt1.text.toString()
                    input1 = str.toFloat()
                     res1 = speed(input1)
                    txtview1.text = res1.toString()
                }
                result2.setOnClickListener {
                    var str2 = edttxt2.text.toString()
                    input2 = str2.toFloat()
                     res2 = speed2(input2)
                    txtview2.text = res2.toString()
                }
            }
        }
    }
    fun area(n: Float):Double{
        val res:Double= n/10.764
        return  res
    }
    fun area2(n: Float):Double{
        val res:Double= n*10.764
        return res
    }
    fun height(n: Float):Double{
        val res:Double = n/3.281
        return res
    }
    fun height2(n: Float):Double{
        val res:Double = n*3.281
        return res
    }
    fun weight(n: Float):Double{
        val res:Double = n*2.205
        return res
    }
    fun weight2(n: Float):Double{
        val res:Double = n/2.205
        return res
    }
    fun volume(n: Float):Double{
        val res:Float = n/1000
        val res1:Double = res.toDouble()
        return res1
    }
    fun volume2(n: Float):Double{
        val res:Float = n*1000
        val res1:Double = res.toDouble()
        return res1
    }
    fun speed(n: Float):Double{
        val res:Double = n/3.6
        return res
    }
    fun speed2(n: Float):Double{
        val res:Double = n*3.6
        return res
    }

}