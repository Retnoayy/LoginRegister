package com.retno.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Register_Activity extends AppCompatActivity {

    private EditText inputUsername, inputEmail, inputPassword;
    private CheckBox checkBoxSyarat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Inisialisasi komponen tampilan
        inputUsername = findViewById(R.id.registuser);
        inputEmail = findViewById(R.id.registemail);
        inputPassword = findViewById(R.id.registpass);
        checkBoxSyarat = findViewById(R.id.checkBox);
        Button createAccountButton = findViewById(R.id.btcrtaccount);
        Button loginButton = findViewById(R.id.btnlogin1);

        // Set listener untuk tombol Create Account
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();
            }
        });

        // Set listener untuk tombol Login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToLogin();
            }
        });
    }

    // Method untuk membuat akun baru
    private void createAccount() {
        if (checkBoxSyarat.isChecked()) {
            // Mendapatkan data yang dimasukkan oleh pengguna
            String username = inputUsername.getText().toString();
            String email = inputEmail.getText().toString();
            String password = inputPassword.getText().toString();

            // Membuat intent untuk pindah ke halaman register success dan mengirim data
            Intent intent = new Intent(Register_Activity.this, Detail_Regist_Activity.class);
            intent.putExtra("username", username);
            intent.putExtra("email", email);
            intent.putExtra("password", password);
            startActivity(intent);
        } else {
            // Jika syarat dan ketentuan belum disetujui, tampilkan pesan kesalahan
            Toast.makeText(Register_Activity.this, "Mohon setujui syarat dan ketentuan", Toast.LENGTH_SHORT).show();
        }
    }

    // Method untuk navigasi ke halaman login
    private void navigateToLogin() {
        Intent intent = new Intent(Register_Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
