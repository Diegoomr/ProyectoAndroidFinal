package com.example.proyectofinal;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.app.NavUtils;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Objects;

public class Sandwiches extends AppCompatActivity {
    private Sand sand = new Sand();

    ArrayList<Sand> nombres =  new ArrayList<Sand>();
    //this.setTitle(R.string.lista);
    @SuppressLint("ResourceAsColor")
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        LinearLayout linear = (LinearLayout) findViewById(R.id.linearlayout);
        LinearLayout bot = (LinearLayout) findViewById(R.id.lyboton);



        Boton(getString(R.string.chacarero),getString(R.string.ichacarero),getString(R.string.pchacarero),getString(R.string.imgch));
        Boton(getString(R.string.italiano),getString(R.string.iitaliano),getString(R.string.pitaliano), getString(R.string.imgit));
        Boton(getString(R.string.barrosluco),getString(R.string.ibarrosluco),getString(R.string.pbarrosluco), getString(R.string.imgbl));
        Boton(getString(R.string.barrosjarpa),getString(R.string.ibarrosjarpa),getString(R.string.pbarrosjarpa), getString(R.string.imgbj));
        Boton(getString(R.string.vegetariano),getString(R.string.ivegetariano),getString(R.string.pvegatariano), getString(R.string.imgvg));


        for(Sand i: nombres){
            Button botonesh = new Button(this);
            botonesh.setBackgroundResource(R.color.boton);

            //botonesh.getLayoutParams();
            botonesh.setText(i.nombres);
            botonesh.setTextSize(30);



            final String name = i.nombres;
            final String descripcion = i.descripcion;
            final String precio = i.precio;
            final int codImg = i.img;
            //final int codImg = i.getImg();
            //System.out.println("el codigo es "+codI);

            botonesh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent info= new Intent(getApplicationContext(),InfoSandwich.class);
                    info.putExtra("nombre",name);
                    info.putExtra("descripcion",descripcion);
                    info.putExtra("precio",precio);
                    info.putExtra("codigoh",codImg);
                    startActivity(info);
                }
                });

            bot.addView(botonesh);

        }
    }

    public void Boton(String nombre, String descripcion, String precio, String img){
        String nombresandwich = nombre;
        String desc = descripcion;
        String precios = precio;
        String imagen = img;
        int codI = getResources().getIdentifier(imagen,"drawable",this.getPackageName());
        //Drawable imagenS = imagen;
        Sand sandwich = new Sand (nombresandwich,desc,precios,codI);
        nombres.add(sandwich);

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
