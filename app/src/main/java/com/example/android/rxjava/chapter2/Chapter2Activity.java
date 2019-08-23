package com.example.android.rxjava.chapter2;

import android.annotation.SuppressLint;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.android.rxjava.R;
import com.jakewharton.rxbinding3.widget.RxTextView;
import io.reactivex.Observable;

public class Chapter2Activity extends AppCompatActivity {

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2);

        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);

        TextView textView = findViewById(R.id.textView2);

        Observable<CharSequence> et2Observable = RxTextView.textChanges(editText2);
        Observable<CharSequence> et3Observable = RxTextView.textChanges(editText3);

        Observable.combineLatest(et2Observable, et3Observable, (et2Text, et3Text) -> {
            return et2Text.toString() + et3Text.toString();
        }).subscribe(text -> {
           textView.setText(text);
        });
    }
}
