package com.example.helloname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class TinhTong extends AppCompatActivity {
    EditText edt1,edt2;
    Button btnCong,btnTru,btnNhan,btnChia,btnRandom;
    TextView txtKq;
    TextView tvToanTu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh_tong);

        edt1 = (EditText) findViewById(R.id.editText1);
        edt2 = (EditText) findViewById(R.id.editText2);
        btnCong = (Button) findViewById(R.id.btnTong);
        txtKq = (TextView) findViewById(R.id.txtKetQua);
        tvToanTu = (TextView) findViewById(R.id.textViewToanTu);
        btnTru = (Button) findViewById(R.id.buttonTru);
        btnNhan = (Button) findViewById(R.id.buttonNhan);
        btnChia = (Button) findViewById(R.id.buttonChia);
        btnRandom = (Button) findViewById(R.id.buttonRandom);


        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvToanTu.setText("+");
                String chuoi1 = edt1.getText().toString();
                String chuoi2 = edt2.getText().toString();

                if(chuoi1.length()==0 || chuoi2.length()==0){
                    Toast.makeText(TinhTong.this,"Vui lòng nhập đủ số",Toast.LENGTH_LONG).show();;

                }else {

                float so1 = Float.parseFloat(chuoi1);
                float so2 = Float.parseFloat(chuoi2);

                float tong = so1 + so2;
                txtKq.setText(tong + "");}
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvToanTu.setText("-");
                String chuoi1 = edt1.getText().toString();
                String chuoi2 = edt2.getText().toString();


                if(chuoi1.length()==0 || chuoi2.length()==0){
                    Toast.makeText(TinhTong.this,"Vui lòng nhập đủ số",Toast.LENGTH_LONG).show();;

                }else {


                float so1 = Float.parseFloat(chuoi1);
                float so2 = Float.parseFloat(chuoi2);

                float hieu = so1 - so2;
                txtKq.setText(hieu + "");}
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvToanTu.setText("*");
                String chuoi1 = edt1.getText().toString();
                String chuoi2 = edt2.getText().toString();


                if(chuoi1.length()==0 || chuoi2.length()==0){
                    Toast.makeText(TinhTong.this,"Vui lòng nhập đủ số",Toast.LENGTH_LONG).show();;

                }else {

                float so1 = Float.parseFloat(chuoi1);
                float so2 = Float.parseFloat(chuoi2);

                float tich = so1 * so2;
                txtKq.setText(tich + "");}

            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvToanTu.setText("/");
                String chuoi1 = edt1.getText().toString();
                String chuoi2 = edt2.getText().toString();


                if(chuoi1.length()==0 || chuoi2.length()==0){
                    Toast.makeText(TinhTong.this,"Vui lòng nhập đủ số",Toast.LENGTH_LONG).show();;

                }else {

                float so1 = Float.parseFloat(chuoi1);
                float so2 = Float.parseFloat(chuoi2);

                float thuong = so1 / so2;
                txtKq.setText(thuong + "");}

            }
        });
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String chuoi1 = edt1.getText().toString();
                String chuoi2 = edt2.getText().toString();


                if(chuoi1.length()==0 || chuoi2.length()==0){
                    Toast.makeText(TinhTong.this,"Vui lòng nhập đủ số",Toast.LENGTH_LONG).show();;

                }else {

                int so1 = Integer.parseInt(chuoi1);
                int so2 = Integer.parseInt(chuoi2);

             if(so1>so2){
                 Random rnd = new Random();
                 int soNgauNhien = rnd.nextInt((so1 - so2) + 1) + so2;
                 txtKq.setText(soNgauNhien + "");
             }

             else{
                 Random rnd = new Random();
                 int soNgauNhien = rnd.nextInt((so2 - so1) + 1) + so1;
                 txtKq.setText(soNgauNhien + "");
                 }

            }}
        });
    }
}