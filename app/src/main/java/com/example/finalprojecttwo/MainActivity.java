package com.example.finalprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.content.Intent;
import android.os.Bundle;
import android.os.MessageQueue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer music;
    EditText editText;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        music = MediaPlayer.create(
                this, R.raw.tokyodrift);

        txt = findViewById(R.id.textView);
        editText = findViewById(R.id.edit_text);
        btn = findViewById(R.id.btn);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = editText.getText().toString();
                boolean play = true;
                Intent i = new Intent(
                        getApplicationContext(),
                        MainPage.class
                );
                MainPage s = new MainPage();
                i.putExtra("name ", userName);
                startActivity(i);

            }



        });




    }
    public void musicplay(View v)
    {
        music.start();
    }
}