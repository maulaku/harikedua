package com.example.harikedua;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class HitungHitungDuit extends AppCompatActivity {
    EditText edt_nilai_pertama,edt_nilai_kedua;
            Button btn_hitung;
    TextView tv_hasil;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //panggil view
        setContentView(R.layout.hitung_duit);
        //inisilisasi
         edt_nilai_pertama = (EditText)findViewById(R.id.edt_nilai_pertama);
         edt_nilai_kedua = (EditText)findViewById(R.id.edt_nilai_kedua);
         btn_hitung = (Button)findViewById(R.id.btn_hitung);
         tv_hasil = (TextView)findViewById(R.id.tv_hasil);

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(HitungHitungDuit.this, "Cek Uji Button", Toast.LENGTH_SHORT).show();*/
                hitungHitungDuitgakAda();
            }
        });
    }

    private void hitungHitungDuitgakAda() {
        String ambilNilaiPertama = edt_nilai_pertama.getText().toString();
        String ambilNilaiKedua = edt_nilai_kedua.getText().toString();
        /*Double hasil = Double.valueOf(ambilNilaiPertama)+Double.valueOf(ambilNilaiKedua);*/

        if (ambilNilaiPertama.isEmpty() || ambilNilaiKedua.isEmpty())
        {
    Toast.makeText(HitungHitungDuit.this, "Cek Uji Button", Toast.LENGTH_SHORT).show();
}
else {


            Long hasil = Long.parseLong(ambilNilaiPertama) + Long.parseLong(ambilNilaiKedua);
            tv_hasil.setText("Hasilnya adalah" + hasil);


            final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Hasil dari penjualan");
            alertDialog.setMessage("Hasilnya adalah" + hasil);
            alertDialog.setCancelable(false);
          /*  alertDialog.show();*/
            // munculin positive button ("Nama Button", Listeber)
            alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                    edt_nilai_pertama.setText("");
                    edt_nilai_kedua.setText("");

                }
            });

            alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                       // intent pindah  ke activity lain
                    // punya 2 parameter (context/activity do berasal, pindah kemana?)
                    Intent pindahKeactivityLain = new Intent(HitungHitungDuit.this,WebviewActivity.class);
                    startActivity(pindahKeactivityLain);
                }
            });
            alertDialog.show();
        }
    }

}
