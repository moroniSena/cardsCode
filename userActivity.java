package com.example.moron_000.cards20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class userActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);
        EditText etUsername = (EditText) findViewById(R.id.etUsername);
        EditText etAge = (EditText) findViewById(R.id.etAge);
        Button bMenu = (Button) findViewById(R.id.bMenu);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        int age = intent.getIntExtra("age", -1);

        String message = name + " welcome to your  card.";
        tvWelcomeMsg.setText(message);
        etUsername.setText(username);
        etAge.setText(age + "");

        bMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(userActivity.this, OptionsActivity.class);
                userActivity.this.startActivity(registerIntent);
            }
        });

    }

}
