package com.example.evunidad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    EditText Dir1, Dir2, Dir3;
    Button Enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dir1 = findViewById(R.id.dir1);
        Dir2 = findViewById(R.id.dir2);
        Dir3 = findViewById(R.id.dir3);
        Enviar = findViewById(R.id.b_a);

        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dir1 = Dir1.getText().toString();
                String dir2 = Dir2.getText().toString();
                String dir3 = Dir3.getText().toString();

                Intent intent = new Intent(getApplicationContext(),activity_map.class);
                intent.putExtra("dir1", dir1.toString());
                intent.putExtra("dir2", dir2.toString());
                intent.putExtra("dir3", dir3.toString());
                startActivity(intent);
            }
        });
    }
}