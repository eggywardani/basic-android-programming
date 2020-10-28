package com.eggy.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    private Button btnSave, btnEdit, btnDelete;
    private EditText edtInputName, edtInputNim, edtInputJurusan, edtInputAlamat;
    private TextView resultName, resultNim, resultJurusan, resultAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        edtInputName = (EditText)findViewById(R.id.edt_nama);
        edtInputNim = (EditText)findViewById(R.id.edt_nim);
        edtInputJurusan = (EditText)findViewById(R.id.edt_jurusan);
        edtInputAlamat = (EditText)findViewById(R.id.edt_alamat);
        resultName = (TextView) findViewById(R.id.result_nama);
        resultNim = (TextView) findViewById(R.id.result_nim);
        resultJurusan = (TextView) findViewById(R.id.result_jurusan);
        resultAlamat = (TextView) findViewById(R.id.result_alamat);
        btnSave = (Button)findViewById(R.id.btn_simpan);
        btnEdit = (Button)findViewById(R.id.btn_edit);
        btnDelete = (Button)findViewById(R.id.btn_hapus);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nim, nama, jurusan, alamat;
                 nim = edtInputNim.getText().toString().trim();
                 nama = edtInputName.getText().toString().trim();
                 jurusan = edtInputJurusan.getText().toString().trim();
                 alamat = edtInputAlamat.getText().toString().trim();

                resultNim.setText(nim);
                resultName.setText(nama);
                resultJurusan.setText(jurusan);
                resultAlamat.setText(alamat);



            }
        });



    }
}