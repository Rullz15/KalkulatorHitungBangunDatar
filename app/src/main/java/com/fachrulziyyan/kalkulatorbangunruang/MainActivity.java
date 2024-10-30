package com.fachrulziyyan.kalkulatorbangunruang;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnSegitiga,btnPersegi,btnLingkaran,btnPersegiPanjang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        btnSegitiga=(Button) findViewById(R.id.button_triangle);
        btnLingkaran=(Button) findViewById(R.id.button_circle);
        btnPersegi=(Button) findViewById(R.id.button_square);
        btnPersegiPanjang=(Button) findViewById(R.id.button_rectangle);

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}