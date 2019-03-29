package com.example.apple.time;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getId();
    }

    private void getId(){
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @SuppressLint("SetTextIl8n")
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button:
                TextView tv=findViewById(R.id.tv);
                @SuppressLint("SimpleDataFormat")SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                Date curDate = new Date(System.currentTimeMillis());
                String str = formatter.format(curDate);
                tv.setText(str);
        }
    }
}
