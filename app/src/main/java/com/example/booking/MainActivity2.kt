package com.example.booking

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        intent?.extras?.let {

        val value1 = it.getString("Key1")
        val value2 = it.getString("Key2")
        val value3 = it.getString("Key3")
        val editText4 = findViewById<EditText>(R.id.editTextTextPersonName4)
        val userInput4 = editText4.text.toString()
        val editText5 = findViewById<EditText>(R.id.editTextTextPersonName5)
        val userInput5 = editText5.text.toString()
        val editText6 = findViewById<EditText>(R.id.editTextTextPersonName6)
        val userInput6 = editText6.text.toString()

            val button = findViewById<Button>(R.id.button)
            button.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("Key1", value1)
                bundle.putString("Key2", value2)
                bundle.putString("Key3", value3)
                bundle.putString("Key4", userInput4)
                bundle.putString("Key5", userInput5)
                bundle.putString("Key6", userInput6)
                val intent = Intent().putExtras(bundle)
                setResult(Activity.RESULT_OK, intent.putExtras(bundle))
                finish()
                startActivity(Intent(this,MainActivity::class.java))
            }
    }


    }
}