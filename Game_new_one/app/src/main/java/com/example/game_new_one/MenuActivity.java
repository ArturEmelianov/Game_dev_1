package com.example.game_new_one;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity { //menu activity, provides a menu with 3 buttons - start, options, exit

    public Button bt_play;
    public ImageView iv_background;
    private Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        exitButton= (Button) findViewById(R.id.bt_exit);


        iv_background = (ImageView)findViewById(R.id.iv_background_menu);
        iv_background.setImageResource(R.drawable.bac2);

        bt_play = (Button)findViewById(R.id.bt_play);

        bt_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    exitButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            System.exit(0);
        }
    });
    }
}
