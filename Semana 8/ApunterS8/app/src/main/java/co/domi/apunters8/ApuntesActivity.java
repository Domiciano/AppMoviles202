package co.domi.apunters8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ApuntesActivity extends AppCompatActivity {

    private Button comunidadBtn;
    private Button misApuntesBtn;
    private Button publishBtn;
    private EditText newApunteET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apuntes);

        comunidadBtn = findViewById(R.id.comunidadBtn);
        misApuntesBtn = findViewById(R.id.misApuntesBtn);
        publishBtn = findViewById(R.id.publishBtn);
        newApunteET = findViewById(R.id.newApunteET);
    }
}