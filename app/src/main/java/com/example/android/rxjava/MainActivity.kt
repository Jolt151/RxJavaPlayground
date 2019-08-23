package com.example.android.rxjava

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android.rxjava.chapter1.Chapter1Activity
import com.example.android.rxjava.chapter2.Chapter2Activity
import org.jetbrains.anko.find

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chapter1Button: Button = find(R.id.chapter1)
        chapter1Button.setOnClickListener {
            startActivity(Intent(this, Chapter1Activity::class.java))
        }

        val chapter2Button: Button = find(R.id.chapter2)
        chapter2Button.setOnClickListener {
            startActivity(Intent(this, Chapter2Activity::class.java))
        }
    }
}
