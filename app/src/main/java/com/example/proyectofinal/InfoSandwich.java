package com.example.proyectofinal;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class InfoSandwich extends AppCompatActivity {
    private Sand sand ;
    String nombre,descripcion,precio,nombrei;
    TextView titulop, infop, preciop;
    ImageView imagen;
    Button comprar;
    int cod;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_sandwich);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        sand = (Sand) getIntent().getSerializableExtra("serializable");

        nombre = getIntent().getStringExtra("nombre");
        descripcion = getIntent().getStringExtra("descripcion");
        precio = getIntent().getStringExtra("precio");
        cod =  getIntent().getIntExtra("codigoh",cod);
        System.out.println("el nombrecito es "+nombre+" cod:"+cod );


        imagen = findViewById(R.id.imgid);
        imagen.setImageResource(cod);

        titulop = findViewById(R.id.titulo);
        titulop.setText(nombre);

        infop = findViewById(R.id.info);
        infop.setText(descripcion);

        preciop = findViewById(R.id.precioid);
        preciop.setText(precio);

        comprar = findViewById(R.id.comprar);

        comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprar = new Intent(getApplicationContext(),Comprar.class);
                startActivity(comprar);
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
