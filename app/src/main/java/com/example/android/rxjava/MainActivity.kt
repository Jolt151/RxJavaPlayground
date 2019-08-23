package com.example.android.rxjava

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android.rxjava.chapter1.Chapter1Activity
import org.jetbrains.anko.find

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = find(R.id.chapter1)
        button.setOnClickListener {
            startActivity(Intent(this, Chapter1Activity::class.java))
        }
    }
}
