package com.example.hesapmakinesi

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.hesapmakinesi.R

class MainActivity : AppCompatActivity() {

    private lateinit var resultText: TextView
    private var currentInput = ""
    private var totalSum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText = findViewById(R.id.textViewResult)

        // Rakam butonları için id'leri listele
        val buttonIds = listOf(
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3,
            R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7,
            R.id.btn8, R.id.btn9
        )

        for (id in buttonIds) {
            findViewById<Button>(id).setOnClickListener {
                val digit = (it as Button).text.toString()
                currentInput += digit
                resultText.text = currentInput
            }
        }

        // + tuşu
        findViewById<Button>(R.id.btnAdd).setOnClickListener {
            if (currentInput.isNotEmpty()) {
                totalSum += currentInput.toInt()
                currentInput = ""
                resultText.text = totalSum.toString()
            }
        }

        // C (Clear) tuşu
        findViewById<Button>(R.id.btnClear).setOnClickListener {
            currentInput = ""
            totalSum = 0
            resultText.text = "0"
        }
    }
}
