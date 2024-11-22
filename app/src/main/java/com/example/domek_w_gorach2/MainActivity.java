package com.example.domek_w_gorach2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button like;
    private  Button delete;
    private Button save;
    private int ilosc=0;
    private TextView polubienia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        like =findViewById(R.id.like);
        delete=findViewById(R.id.delete);
        save=findViewById(R.id.save);

        polubienia=findViewById(R.id.polubienia);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ilosc++;
                polubienia.setText(String.valueOf(ilosc));
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ilosc--;
                polubienia.setText(String.valueOf(ilosc));
                if(ilosc<0){
                    ilosc=0;
                    polubienia.setText(String.valueOf(ilosc));
                }
            }
        });

    }
}