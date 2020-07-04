package es.fgd192.a4lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                val box = findViewById<CheckBox>(R.id.box)
                val box2 = findViewById<CheckBox>(R.id.box2)
                val box3 = findViewById<CheckBox>(R.id.box3)
                val next = findViewById<Button>(R.id.button)
                next.setOnClickListener{
                    val textInfo = text.text.toString()
                    val textInfo2 = text2.text.toString()
                    val textInfo3 = text3.text.toString()
                    val boxInfo = box.isChecked
                    val boxInfo2 = box2.isChecked
                    val boxInfo3 = box3.isChecked
                    val intent = Intent(this,SecondActivity::class.java)
                    intent.putExtra("textInfo",textInfo)
                    intent.putExtra("textInfo2",textInfo2)
                    intent.putExtra("textInfo3",textInfo3)
                    intent.putExtra("boxInfo",boxInfo)
                    intent.putExtra("boxInfo2",boxInfo2)
                    intent.putExtra("boxInfo3",boxInfo3)
                    startActivity(intent)
                }
            }
        }