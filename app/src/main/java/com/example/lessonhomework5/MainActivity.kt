package com.example.lessonhomework5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {
    lateinit var tvResult: TextView

    var y: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvResult = findViewById(R.id.tv)
    }

    fun btn0(view: View) {
        tvResult.append("0")
    }

    fun btn1(view: View) {
        tvResult.append("1")
    }
    fun btn2(view: View) {
        tvResult.append("2")
    }
    fun btn3(view: View) {
        tvResult.append("3")
    }
    fun btn4(view: View) {
        tvResult.append("4")
    }
    fun btn5(view: View) {
        tvResult.append("5")
    }
    fun btn6(view: View) {
        tvResult.append("6")
    }
    fun btn7(view: View) {
        tvResult.append("7")

    }fun btn8(view: View) {
        tvResult.append("8")
    }

    fun btn9(view: View) {
        tvResult.append("9")
    }

    fun btnPo(view: View) {
        tvResult.append(".")
    }

    fun btnSum(view: View) {
        tvResult.append("+")
    }

    fun btnMi(view: View) {
        tvResult.append("-")
    }

    fun btnMu(view: View) {
        tvResult.append("*")
    }

    fun btnDiv(view: View) {
        tvResult.append("/")
    }

    fun btnPe(view: View) {
        tvResult.append("%")
    }

    fun btnC(view: View) {
        tvResult.text = ""
    }

    fun btnX(view: View) {
        val str = tvResult.text.toString()
        if (str.isNotEmpty()) tvResult.text = str.substring(0, str.length - 1)
    }

    fun equal(view: View) {
        try {
            val ex = ExpressionBuilder(tvResult.text.toString()).build()
            val result = ex.evaluate()
            tvResult.text = result.toString()
        } catch (e:Exception) {
            Log.d("ERROR", "error")
        }

    }
}