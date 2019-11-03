package com.example.cobasiakad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button tambah;
    EditText inputmatkul1,inputmatkul2,inputmatkul3,inputmatkul4,inputmatkul5,inputmatkul6,inputmatkul7;
    EditText inputsks1,inputsks2,inputsks3,inputsks4,inputsks5,inputsks6,inputsks7;
    EditText editmatkul1,editmaktul2,editmaktul3,editmaktul4,editmaktul5,editmaktul6,editmaktul7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Ambil Matakuliah".toString());
        setContentView(R.layout.activity_main);
        RecyclerView rv;
        ArrayList <SiakadModel> arrayList= new ArrayList<>();

        inputmatkul1 = findViewById(R.id.input_matkul1);
        inputmatkul2 = findViewById(R.id.input_matkul2);
        inputmatkul3 = findViewById(R.id.input_matkul3);
        inputmatkul4 = findViewById(R.id.input_matkul4);
        inputmatkul5 = findViewById(R.id.input_matkul5);
        inputmatkul6 = findViewById(R.id.input_matkul6);
        inputmatkul7 = findViewById(R.id.input_matkul7);
        inputsks1 = findViewById(R.id.inputsks1);
        inputsks2 = findViewById(R.id.inputsks2);
        inputsks3 = findViewById(R.id.inputsks3);
        inputsks4 = findViewById(R.id.inputsks4);
        inputsks5 = findViewById(R.id.inputsks5);
        inputsks6 = findViewById(R.id.inputsks6);
        inputsks7 = findViewById(R.id.inputsks7);
        tambah = findViewById(R.id.simpan);


        String[] semester = {"Semester 1","Semester 2","Semester 3"};
        String[] matkul1 = {"Algoritma dan Pemrograman","Sistem Informasi","Pemrograman Web"};
        String[] matkul2 = {"Kalkulus 1","Aljabar Linear","B.indo"};
        String[] matkul3 = {"K3LH","Kalkulus 2","Basis Data 2"};
        String[] matkul4 = {"Komunikasi Interpersonal","Strutur Data","Pemrograman Berorientasi Objek"};
        String[] matkul5 = {"Sistem Digital","Arsitektur Komputer","Teori Bahasa dan Otomata"};
        String[] matkul6 ={"Bahasa Inggris 1","Bahasa Inggris 2","Multimedia"};
        String[] sks1 = {"3","2","3"};
        String[] sks2 = {"2","3","3"};
        String[] sks3 = {"2","3","3"};
        String[] sks4 = {"3","3","2"};
        String[] sks5 = {"2","2","3"};
        String[] sks6 = {"2","3","2"};
        String [] total= {"14","16","16"};

        rv = findViewById(R.id.tvsiakad);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(linearLayoutManager);
        for (int i=0;i<semester.length;i++){
            SiakadModel model = new SiakadModel(semester[i],matkul1[i],matkul2[i],matkul3[i],matkul4[i],matkul5[i],matkul6[i],sks1[i],sks2[i],sks3[i],sks4[i],sks5[i],sks6[i],total[i]);
            arrayList.add(model);
        }
        SiakadAdapter siakadAdapter = new SiakadAdapter(MainActivity.this,arrayList);
        rv.setAdapter(siakadAdapter);


        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputsks1.getText().toString().equals("") || inputsks2.getText().toString().equals("") ||inputsks3.getText().toString().equals("") || inputsks4.getText().toString().equals("") || inputsks5.getText().toString().equals("") || inputsks6.getText().toString().equals("") || inputsks7.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Kolom sks tidak boleh kosong,jika tidak di isi harap diisi 0",Toast.LENGTH_SHORT).show();
                }else{
                    tambahmatkul();
                }

            }
        });
    }

    public void tambahmatkul(){
        String matkul1 = inputmatkul1.getText().toString();
        String matkul2 = inputmatkul2.getText().toString();
        String matkul3 = inputmatkul3.getText().toString();
        String matkul4 = inputmatkul4.getText().toString();
        String matkul5 = inputmatkul5.getText().toString();
        String matkul6 = inputmatkul6.getText().toString();
        String matkul7 = inputmatkul7.getText().toString();
        String sks1 = inputsks1.getText().toString();
        String sks2 = inputsks2.getText().toString();
        String sks3 = inputsks3.getText().toString();
        String sks4 = inputsks4.getText().toString();
        String sks5 = inputsks5.getText().toString();
        String sks6 = inputsks6.getText().toString();
        String sks7 = inputsks7.getText().toString();


        int a,b,c,d,e,f,g;
        int total = 0;
        a = Integer.parseInt(sks1);
        b = Integer.parseInt(sks2);
        c = Integer.parseInt(sks3);
        d = Integer.parseInt(sks4);
        e = Integer.parseInt(sks5);
        f = Integer.parseInt(sks6);
        g = Integer.parseInt(sks7);

        total = a+b+c+d+e+f+g;
        String tvtotal = Integer.toString(total);


        Intent kirim = new Intent(MainActivity.this,Overview.class);
        kirim.putExtra("matkul1",matkul1);
        kirim.putExtra("matkul2",matkul2);
        kirim.putExtra("matkul3",matkul3);
        kirim.putExtra("matkul4",matkul4);
        kirim.putExtra("matkul5",matkul5);
        kirim.putExtra("matkul6",matkul6);
        kirim.putExtra("matkul7",matkul7);
        kirim.putExtra("sks1",sks1);
        kirim.putExtra("sks2",sks2);
        kirim.putExtra("sks3",sks3);
        kirim.putExtra("sks4",sks4);
        kirim.putExtra("sks5",sks5);
        kirim.putExtra("sks6",sks6);
        kirim.putExtra("sks7",sks7);
        kirim.putExtra("totalsks",tvtotal);
        startActivity(kirim);


    }
}
