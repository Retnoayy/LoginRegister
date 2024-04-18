package com.retno.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Detail_Regist_Activity extends AppCompatActivity {

    private EditText inputUsername, inputEmail, inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_regist);


        // Mengambil data yang dikirim dari halaman sebelumnya
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String username = extras.getString("username");
            String email = extras.getString("email");
            String password = extras.getString("password");

            // Menampilkan data yang diterima di EditText yang sesuai
            inputUsername = findViewById(R.id.detail_username);
            inputEmail = findViewById(R.id.detail_email);
            inputPassword = findViewById(R.id.detail_password);

            inputUsername.setText(username);
            inputEmail.setText(email);
            inputPassword.setText(password);
        }
    }
}
