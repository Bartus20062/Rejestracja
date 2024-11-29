package com.example.rejestracja;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText haslo;
    private EditText haslo2;
    private Button zatweirdz;
    private TextView komunikat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.mail);
        haslo = findViewById(R.id.haslo);
        haslo2 = findViewById(R.id.haslo2);
        komunikat = findViewById(R.id.powiadomienie);
        zatweirdz = findViewById(R.id.zatwierdz);

        haslo.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        haslo2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        zatweirdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email1 = email.getText().toString().trim();
                String haslo1 = haslo.getText().toString().trim();
                String haslo3 = haslo2.getText().toString().trim();

                if (!email1.contains("@"))
                {komunikat.setText("Nieprawidłowy adres email!");}
                else if(!haslo1.equals(haslo3))
                {komunikat.setText("Hasła sie różnią!");}
                else
                {komunikat.setText("Witaj "+ email1);}
            }
        });

    }
}