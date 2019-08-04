package com.falams.guinee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pita extends AppCompatActivity {
    private EditText Aa;
    private EditText Bb;
    private  EditText Cc;
    private EditText Dd;
private Button Ee;
private String Aaa, Bbb, Ccc, Ddd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pita);
        Aa=(EditText)findViewById(R.id.A);
        Bb=(EditText)findViewById(R.id.B);
        Cc=(EditText)findViewById(R.id.C);
        Dd=(EditText)findViewById(R.id.D);
        Ee=(Button)findViewById(R.id.E);
        Ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Aaa=Aa.getText().toString().trim();
                String Bbb=Bb.getText().toString().trim();
                String Ccc=Cc.getText().toString().trim();
                String Ddd=Dd.getText().toString().trim();
                if(Aa.getText().toString().trim().isEmpty()){
                    Toast.makeText(pita.this,"Ce champs est obligatoire",Toast.LENGTH_LONG).show();
                }
                else if (Bb.getText().toString().trim().isEmpty()){
                    Toast.makeText(pita.this, "Ce champs est obligatoire",Toast.LENGTH_LONG).show();
                }
                else if (Cc.getText().toString().trim().isEmpty()){
                    Toast.makeText(pita.this,"Ce champs est obligatoire", Toast.LENGTH_LONG).show();
                }
                else if(Dd.getText().toString().trim().isEmpty()){
                    Toast.makeText(pita.this, "Ce champs est obligatoire",Toast.LENGTH_LONG).show();
                }
                else {
                    Intent kolet=new Intent(pita.this,MainActivity.class);
                    startActivity(kolet);
                }

            }
        });
    }
}
