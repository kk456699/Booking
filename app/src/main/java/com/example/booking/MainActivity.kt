package com.example.booking

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText1 = findViewById<EditText>(R.id.editTextTextPersonName1)
        val userInput1 = editText1.text.toString()
        val editText2 = findViewById<EditText>(R.id.editTextTextPersonName2)
        val userInput2 = editText2.text.toString()
        val editText3 = findViewById<EditText>(R.id.editTextTextPersonName3)
        val userInput3 = editText3.text.toString()




        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("Key1", userInput1)
            bundle.putString("Key2", userInput2)
            bundle.putString("Key3", userInput3)

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtras(bundle)
            val requestCode = 1
            startActivityForResult(intent, requestCode)

            //startActivity(Intent(this,MainActivity2::class.java))
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        data?.extras?.let {

            if(requestCode == 1 && resultCode == Activity.RESULT_OK){

                findViewById<TextView>(R.id.textView1).text =
                    "Number of people:${it.getString("Key1")}\n" +
                    "Room type:${it.getString("Key2")}\n" +
                    "Number of room:${it.getString("Key3")}\n" +
                    "Check in time:${it.getString("Key4")}\n" +
                    "Check in date:${it.getString("Key5")}\n" +
                    "Check out date:${it.getString("Key6")}\n"
        }
    }
    }
}