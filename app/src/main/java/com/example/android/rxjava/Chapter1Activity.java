package com.example.android.rxjava;

import android.annotation.SuppressLint;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.jakewharton.rxbinding3.widget.RxTextView;

public class Chapter1Activity extends AppCompatActivity {

    @SuppressLint({"CheckResult", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);

        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);

        RxTextView.textChanges(editText)
                .filter(text -> text.length() >= 7)
                .subscribe(text -> {
                    textView.setText("Typed more than 7 characters");
                });

        RxTextView.textChanges(editText)
                .filter( text -> text.length() >= 7)
                .subscribe(text -> {
                    textView.setText(text);
                });
    }
}
