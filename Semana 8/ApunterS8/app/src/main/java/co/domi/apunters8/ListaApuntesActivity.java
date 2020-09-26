package co.domi.apunters8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ListaApuntesActivity extends AppCompatActivity {

    private TextView apuntesTitle;
    private TextView apuntesTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_apuntes);

        apuntesTitle = findViewById(R.id.apuntesTitle);
        apuntesTV = findViewById(R.id.apuntesTV);
    }
}