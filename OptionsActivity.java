package com.example.moron_000.cards20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        final TextView tvConnect = (TextView) findViewById(R.id.tvConnect);
        final TextView tvAllCards = (TextView) findViewById(R.id.tvAllCards);
        final TextView tvMyCards = (TextView) findViewById(R.id.tvMyCard);
        final TextView tvProfile = (TextView) findViewById(R.id.tvProfile);



    }
}
