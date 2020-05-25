package com.example.tugasprojek3lab;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String masuk;
    TextView judul,hasil;
    ImageView gambar;
    EditText d1,d2;
    Button btn;

    float luas, nilai1,nilai2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        judul = findViewById(R.id.jud);
        hasil = findViewById(R.id.hasilrumus);
        gambar = findViewById(R.id.gambar1);
        d1 = findViewById(R.id.diagonal1);
        d2 = findViewById(R.id.diagonal2);
        btn = findViewById(R.id.hasil1);
        masuk = getIntent().getExtras().getString("masuk1");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (masuk.equals("trapesium")){
            judul.setText("TRAPESIUM");
            getSupportActionBar().setTitle("HITUNG LUAS TRAPESIUM");
            gambar.setImageResource(R.drawable.rumustrapesium);
            d1.setHint("DIAGONAL 1");
            d2.setHint("DIAGONAL 2");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nilai1 = Float.parseFloat(d1.getText().toString());
                    nilai2 = Float.parseFloat(d2.getText().toString());
                    luas  = (nilai1 * nilai2)/2;
                    hasil.setText("LUASNYA ADALAH : "+String.valueOf(luas));
                }
            });

        }else if (masuk.equals("segitiga")){
            judul.setText("SEGITIGA");
            getSupportActionBar().setTitle("HITUNG LUAS SEGITIGA");
            gambar.setImageResource(R.drawable.rumussegitiga);
            d1.setHint("ALAS");
            d2.setHint("TINGGI");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nilai1 = Float.parseFloat(d1.getText().toString());
                    nilai2 = Float.parseFloat(d2.getText().toString());
                    luas  = (nilai1 * nilai2)/2;
                    hasil.setText("LUASNYA ADALAH : "+String.valueOf(luas));
                }
            });

        }else if (masuk.equals("belah")){
            judul.setText("BELAH KETUPAT");
            getSupportActionBar().setTitle("HITUNG LUAS BELAH");
            gambar.setImageResource(R.drawable.rumusbelahketupat);
            d1.setHint("DIAGONAL 1");
            d2.setHint("DIAGONAL 2");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nilai1 = Float.parseFloat(d1.getText().toString());
                    nilai2 = Float.parseFloat(d2.getText().toString());
                    luas  = (nilai1 * nilai2)/2;
                    hasil.setText("LUASNYA ADALAH : "+String.valueOf(luas));
                }
            });

        }else if (masuk.equals("layang")){
            judul.setText("LAYANG-LAYANG");
            getSupportActionBar().setTitle("HITUNG LUAS LAYANG-LAYANG");
            gambar.setImageResource(R.drawable.rumuslayang);
            d1.setHint("DIAGONAL 1");
            d2.setHint("DIAGONAL 2");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nilai1 = Float.parseFloat(d1.getText().toString());
                    nilai2 = Float.parseFloat(d2.getText().toString());
                    luas  = (nilai1 * nilai2)/2;
                    hasil.setText("LUASNYA ADALAH : "+String.valueOf(luas));
                }
            });

        }


    }
}
