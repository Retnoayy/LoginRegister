package com.retno.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detail_Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_login);

        // Mengambil data username dan password yang dikirim dari halaman sebelumnya
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String username = extras.getString("username");
            String password = extras.getString("password");

            // Menampilkan data username dan password pada TextView yang sesuai
            TextView textViewUsername = findViewById(R.id.textViewUsername);
            TextView textViewPassword = findViewById(R.id.textViewPassword);

            textViewUsername.setText(username);
            textViewPassword.setText(password);
        }
    }
}
