package com.example.latihan2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button explicitintent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button)findViewById(R.id.button);
        explicitintent.setOnClickListener(this);



    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case  R.id.button:
                Intent explicit = new Intent ( getApplicationContext(), Main2Activity.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}
