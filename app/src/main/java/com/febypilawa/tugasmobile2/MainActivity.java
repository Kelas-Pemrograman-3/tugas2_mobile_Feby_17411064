package com.febypilawa.tugasmobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    EditText edtnpm;
    EditText edtnama;
    Button btnsimpan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnpm =(EditText) findViewById(R.id.edtnpm);
        edtnama=(EditText) findViewById(R.id.edtnama);
        btnsimpan=(Button) findViewById(R.id.btnsimpan);

        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtnpm.getText().toString();
                String datas = edtnama.getText().toString();

                Intent next = new Intent(MainActivity.this,page2.class);
                next.putExtra("data",data);
                next.putExtra("datas",datas);
                startActivity(next);
                finish();
            }
        });
    }
}

