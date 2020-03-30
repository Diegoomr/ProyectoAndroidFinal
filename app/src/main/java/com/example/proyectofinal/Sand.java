package com.example.proyectofinal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;


public class Sand {

    public String nombres,descripcion,precio;
    public int img;

    public Sand(){
       }

    public Sand(String nombres, String descripcion, String precio, int img) {
        this.nombres = nombres;
        this.descripcion = descripcion;
        this.precio = precio;
        this.img = img;
    }





}
