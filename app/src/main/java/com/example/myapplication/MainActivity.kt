package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
//Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)//savedInstanceState store the last used activity
        setContentView(R.layout.activity_main)

        //val and var are used to declare variables in kotlin
        //if val is used with the variable, yhn the variable cannot be modified. It is like final in java.

        val buttonDownload = findViewById<Button>(R.id.downloadButton)//findViewById is used to initialize the variable
        val buttonUpload = findViewById<Button>(R.id.uploadButton)

        //to change color
        val layout = findViewById<LinearLayout>(R.id.LinearLayout)

        buttonDownload.setOnClickListener {
           Toast.makeText(applicationContext, "Downloading Started", Toast.LENGTH_SHORT).show()
           //to change the color
            layout.setBackgroundResource(R.color.black)
        }
        buttonUpload.setOnClickListener {
            Toast.makeText(applicationContext, "Uploading Started", Toast.LENGTH_SHORT).show()
            layout.setBackgroundResource(R.color.teal_200)
        }
    }
}