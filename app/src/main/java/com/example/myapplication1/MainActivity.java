package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    EditText editpassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editpassword=(EditText) findViewById(R.id.edit_tex_Password);
        btnLogin=(Button) findViewById(R.id.button_Login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isValidacion;
                isValidacion = Validacion.INSTANCE.passwordValida(editpassword);
                Log.e(TAG, "onClick: " + isValidacion );
            }
        });
    }
}
