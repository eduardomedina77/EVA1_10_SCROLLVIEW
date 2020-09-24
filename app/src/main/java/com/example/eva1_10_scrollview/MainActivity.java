package com.example.eva1_10_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtVwTexto;
    final String cade= "Take on the deadliest planet in the known galaxy as a team of dwarven mercenary miners in our upcoming procedurally generated co-op sci-fi shooter - Deep Rock Galactic!\n" +
            "\n" +
            "In the far future, space mining is big business.\n" +
            "\n" +
            "The interplanetary mining corporation DEEP ROCK GALACTIC specializes in securing the most dangerous dig sites in the galaxy. When they need a team for the toughest missions, they call in the Dwarves - mercenary miners, legendary for their ability to survive underground, and infamous for their brutality in combat.\n" +
            "\n" +
            "Join a team of up to 4 players to fight, dig and explore your way through enormous cave systems, uncover the greatest riches, and make it out alive.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwTexto = findViewById(R.id.txtVwTexto);
        txtVwTexto.setText(cade);
    }
}