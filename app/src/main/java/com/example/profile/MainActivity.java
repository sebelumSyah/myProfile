package com.example.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button tombol;
    ImageView salam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        tombol=findViewById(R.id.tombol);
        tombol.setOnClickListener(this);

        salam=findViewById(R.id.salam);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tombol:
            Intent p = new Intent(MainActivity.this,tampilan.class);
            startActivity(p);
            break;

        }

    }
}
