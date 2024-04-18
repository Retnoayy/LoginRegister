package com.retno.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText loginuser;
    private EditText loginpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi komponen tampilan
        loginuser = findViewById(R.id.loginuser);
        loginpass = findViewById(R.id.loginpass);
        Button loginButton = findViewById(R.id.btnloginup);
        Button registerButton = findViewById(R.id.btnregisbottom);

        // Set listener untuk tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });

        // Set listener untuk tombol register
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register_Activity.class);
                startActivity(intent);
            }
        });
    }

    // Method untuk melakukan proses login
    private void loginUser() {
        String username = loginuser.getText().toString();
        String password = loginpass.getText().toString();

        // Proses autentikasi sederhana (ganti dengan logika autentikasi sesuai kebutuhan)
        if (username.equals("RETNO AYU A") && password.equals("12345678")) {
            // Jika username dan password benar, pindah ke halaman login sukses
            Intent intent = new Intent(MainActivity.this, Detail_Login_Activity.class);
            intent.putExtra("username", username); // Kirim username ke halaman login sukses
            intent.putExtra("password", password); // Kirim password ke halaman login sukses
            startActivity(intent);
            finish();
        } else {
            // Jika username dan password salah, tampilkan pesan kesalahan
            Toast.makeText(MainActivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
        }
    }

    // Override method onBackPressed untuk menangani ketika tombol back ditekan
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}
