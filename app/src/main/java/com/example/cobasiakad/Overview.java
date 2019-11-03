package com.example.cobasiakad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Overview extends AppCompatActivity {

    TextView tv_matkul1,tv_matkul2,tv_matkul3,tv_matkul4,tv_matkul5,tv_matkul6,tv_matkul7,tv_semester,tv_total;
    TextView tvsks1,tvsks2,tvsks3,tvsks4,tvsks5,tvsks6,tvsks7;
    String matkul1,matkul2,matkul3,matkul4,matkul5,matkul6,matkul7;
    String semester;
    String sks1,sks2,sks3,sks4,sks5,sks6,sks7,total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        getSupportActionBar().setTitle("Siakad".toString());


        tv_semester = findViewById(R.id.tvsemester);
        tv_matkul1 = findViewById(R.id.tvmatkul1);
        tv_matkul2 = findViewById(R.id.tvmatkul2);
        tv_matkul3 = findViewById(R.id.tvmatkul3);
        tv_matkul4 = findViewById(R.id.tvmatkul4);
        tv_matkul5 = findViewById(R.id.tvmatkul5);
        tv_matkul6 = findViewById(R.id.tvmatkul6);
        tv_matkul7 = findViewById(R.id.tvmatkul7);
        tvsks1 = findViewById(R.id.tvsks1);
        tvsks2 = findViewById(R.id.tvsks2);
        tvsks3 = findViewById(R.id.tvsks3);
        tvsks4 = findViewById(R.id.tvsks4);
        tvsks5 = findViewById(R.id.tvsks5);
        tvsks6 = findViewById(R.id.tvsks6);
        tvsks7 = findViewById(R.id.tvsks7);
        tv_total = findViewById(R.id.tvtotal);



        semester = getIntent().getStringExtra("semester");
        tv_semester.setText(semester);
        matkul1 = getIntent().getStringExtra("matkul1");
        matkul2 = getIntent().getStringExtra("matkul2");
        matkul3 = getIntent().getStringExtra("matkul3");
        matkul4 = getIntent().getStringExtra("matkul4");
        matkul5 = getIntent().getStringExtra("matkul5");
        matkul6 = getIntent().getStringExtra("matkul6");
        matkul7 = getIntent().getStringExtra("matkul7");

        if (matkul1!=null ||matkul2!=null ||matkul3!=null ||matkul4!=null ||matkul5!=null ||matkul6!=null ||matkul7!=null){
            tv_matkul1.setText(matkul1);
            tv_matkul2.setText(matkul2);
            tv_matkul3.setText(matkul3);
            tv_matkul4.setText(matkul4);
            tv_matkul5.setText(matkul5);
            tv_matkul6.setText(matkul6);
            tv_matkul7.setText(matkul7);
        }



        sks1 = getIntent().getStringExtra("sks1");
        sks2 = getIntent().getStringExtra("sks2");
        sks3 = getIntent().getStringExtra("sks3");
        sks4 = getIntent().getStringExtra("sks4");
        sks5 = getIntent().getStringExtra("sks5");
        sks6 = getIntent().getStringExtra("sks6");
        sks7 = getIntent().getStringExtra("sks7");

        tvsks7.setText(sks7);
        tvsks6.setText(sks6);
        tvsks5.setText(sks5);
        tvsks4.setText(sks4);
        tvsks3.setText(sks3);
        tvsks2.setText(sks2);
        tvsks1.setText(sks1);





        total = getIntent().getStringExtra("totalsks");
        tv_total.setText(total);

    }


    public void pindahkrs(View view) {
        Intent intent = new Intent(Overview.this,MainActivity.class);
        startActivity(intent);
    }
}
