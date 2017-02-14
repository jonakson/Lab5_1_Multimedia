package com.example.jcalzado.lab5_1_multimedia;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reproducir(int sonido) {
        MediaPlayer reproductor = MediaPlayer.create(this, sonido);
        reproductor.start();
    }

    public void clickArpa(View v) {
        reproducir(R.raw.arpa);
    }

    public void clickTrompeta(View v) {
        reproducir(R.raw.trompeta);
    }

    public void clickPiano(View v) {
        reproducir(R.raw.piano);
    }

    public void clickTambor(View v) {
        reproducir(R.raw.tambor);
    }

    public void clickTimbal(View v) {
        reproducir(R.raw.timbales);
    }

    public void clickGuitarra(View v) {
        reproducir(R.raw.guitarra_electrica);
    }
}
