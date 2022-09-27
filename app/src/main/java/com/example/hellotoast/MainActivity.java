package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonToast;
    Button buttonCount;
    TextView show_count;
    private int mCounter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonToast=findViewById(R.id.buttonToast);
        buttonCount=(Button)findViewById(R.id.buttonCount);
        show_count =(TextView)findViewById(R.id.show_count);
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter++;
                show_count.setText(Integer.toString(mCounter));
            }


        });

        buttonToast.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,"Hello Toast!",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}