package com.tochy.gamehub.firsttime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.tochy.gamehub.MainActivity;
import com.tochy.gamehub.R;

public class Screen_three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_three);

        ImageView next = (ImageView) findViewById(R.id.btnscreenthree);

        //screen three to screen main activity
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Screen_three.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}