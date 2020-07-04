package es.fgd192.a4lesson

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.support_simple_spinner_dropdown_item)
        val tvtextInfo = findViewById<TextView>(R.id.text)
        val tvtextInfo2 = findViewById<TextView>(R.id.text2)
        val tvtextInfo3 = findViewById<TextView>(R.id.text3)
        val boxData = intent.getBooleanExtra("boxInfo", false)
        val boxData2 = intent.getBooleanExtra("boxInfo2", false)
        val boxData3 = intent.getBooleanExtra("boxInfo3", false)
        if (boxData) {
            tvtextInfo.text = "Титаник"
        }
        if (boxData2)
            tvtextInfo2.text = "Оно"

        if (boxData3)
            tvtextInfo3.text = "Паразиты"
        if (boxData && boxData2)
            tvtextInfo2.text = "Титаник" + "Оно"

        if (boxData2 && boxData3)
            tvtextInfo3.text = "Оно" + "Паразиты"
        if (boxData && boxData3)
            tvtextInfo2.text = "Титаник" + "Паразиты"
        else{
            print("Вы ничего не выбрали")
        }


    }
}