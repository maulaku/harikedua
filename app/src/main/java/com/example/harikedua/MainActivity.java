package com.example.harikedua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG", "in onCreate method");
        // ini munculin showmessaage
        Toast.makeText(MainActivity.this, "onCreate", Toast.LENGTH_SHORT).show();
        hitungDuit();

    }
    protected void hitungDuit() {
        Double uangTransportasiHariIni =25000.0;
        Double uangTransportasiBesok3Hari =75000.0;
        Double uangTransportasiSeluruh =uangTransportasiHariIni+uangTransportasiBesok3Hari;
        Toast.makeText(this, "Hasilnya :"+uangTransportasiSeluruh, Toast.LENGTH_SHORT).show();
        TextView TvUang = (TextView)findViewById(R.id.tv_uang);
        TvUang.setText("Hasil Uang transport sebsear RP"+uangTransportasiSeluruh);

    }

    protected void onStart() {
        super.onStart();
        Log.e("TAG", "in onStart method");
        Toast.makeText(MainActivity.this, "onStart", Toast.LENGTH_SHORT).show();
    }

    protected void onResume() {
        super.onStart();
        Log.e("TAG", "in onResume method");
        Toast.makeText(MainActivity.this, "onResume", Toast.LENGTH_SHORT).show();
    }

    protected void onPause() {
        super.onStart();
        Log.e("TAG", "in onPause method");
        Toast.makeText(MainActivity.this, "onPause", Toast.LENGTH_SHORT).show();
    }

    protected void onStop() {
        super.onStart();
        Log.e("TAG", "in onStop method");
        Toast.makeText(MainActivity.this, "onStop", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy() {
        super.onStart();
        Log.e("TAG", "in onDestroy method");
        Toast.makeText(MainActivity.this, "onDestroy", Toast.LENGTH_SHORT).show();
    }




}
