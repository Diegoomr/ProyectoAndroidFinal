package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button sandwiches, sobren;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sandwiches = findViewById(R.id.sandwiches);
        sobren = findViewById(R.id.sobre);

        sandwiches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sand = new Intent(getApplicationContext(),Sandwiches.class);
                startActivity(sand);
            }
        });
        sobren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sobrenos = new Intent(getApplicationContext(),SobreNosotros.class);
                startActivity(sobrenos);
            }
        });

    }
}
