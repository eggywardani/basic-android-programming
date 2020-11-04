package com.eggy.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import es.dmoral.toasty.Toasty;

public class InputDataActivity extends AppCompatActivity {
    private Button btnSave, btnDelete;
    private EditText edtInputName, edtInputNim, edtInputJurusan, edtInputAlamat;
    private TextView resultName, resultNim, resultJurusan, resultAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);

        edtInputName = (EditText)findViewById(R.id.edt_nama);
        edtInputNim = (EditText)findViewById(R.id.edt_nim);
        edtInputJurusan = (EditText)findViewById(R.id.edt_jurusan);
        edtInputAlamat = (EditText)findViewById(R.id.edt_alamat);
        resultName = (TextView) findViewById(R.id.result_nama);
        resultNim = (TextView) findViewById(R.id.result_nim);
        resultJurusan = (TextView) findViewById(R.id.result_jurusan);
        resultAlamat = (TextView) findViewById(R.id.result_alamat);
        btnSave = (Button)findViewById(R.id.btn_simpan);
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


                if (!nim.isEmpty() && !nama.isEmpty() && !jurusan.isEmpty() && !alamat.isEmpty()){
                    btnSave.setText("Simpan");
                    Toasty.success(getApplicationContext(), "Data berhasil disimpan", Toast.LENGTH_SHORT, false).show();
                }else if (resultNim.getText().toString().matches("") && resultName.getText().toString().matches("") && resultJurusan.getText().toString().matches("") && resultAlamat.getText().toString().matches("")){
                    btnSave.setText("Simpan");
                    Toasty.success(getApplicationContext(), "Data berhasil disimpan", Toast.LENGTH_SHORT, false).show();
                }else {
                    btnSave.setText("Edit");
                    Toasty.success(getApplicationContext(), "Data berhasil diubah", Toast.LENGTH_SHORT, false).show();
                }

            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultNim.setText("");
                resultName.setText("");
                resultJurusan.setText("");
                resultAlamat.setText("");


                if (resultNim.getText().toString().matches("") && resultName.getText().toString().matches("") && resultJurusan.getText().toString().matches("") && resultAlamat.getText().toString().matches("")){
                    btnSave.setText("Simpan");
                }else {
                    btnSave.setText("Edit");
                }


                Toasty.error(getApplicationContext(), "Data berhasil dihapus", Toast.LENGTH_SHORT, false).show();

            }
        });



    }
}