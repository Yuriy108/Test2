package com.example.colorscheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=findViewById(R.id.spinner);
        text=findViewById(R.id.textView);
    }

    public void show(View view) {
        int pos=sp.getSelectedItemPosition();
        String description=getDescription(pos);
        text.setText(description);

    }
    private String getDescription(int pos){
        String [] st=getResources().getStringArray(R.array.colorDescription);
        return st[pos];


    }
}
