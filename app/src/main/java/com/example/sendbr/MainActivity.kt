package com.example.sendbr

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.send_btn)

        val intent  = Intent()

        intent.action = "MyAction"

        intent.component = ComponentName("com.example.receivebr", "com.example.receivebr.MyBroadcastReceiver")


        btn.setOnClickListener {
            sendBroadcast(intent)

            Toast.makeText(this, "clicked", Toast.LENGTH_LONG).show()
        }

    }
}