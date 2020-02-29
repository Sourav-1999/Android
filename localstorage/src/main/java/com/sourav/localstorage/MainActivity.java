package com.sourav.localstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.sourav.localstorage.prefs.Prefs;

public class MainActivity extends AppCompatActivity {


    EditText edtUserName,edtPassword;
    Button btnSave,btnGet;
    TextView  txtW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUserName=findViewById(R.id.edtUserName);
        edtPassword=findViewById(R.id.edtPassword);
        btnSave=findViewById(R.id.btnSave);
        btnGet=findViewById(R.id.btnGet);
        txtW=findViewById(R.id.txtW);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkValidation();
            }
        });
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               showData();
            }
        });
    }

    void checkValidation(){

        if(edtUserName.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter UserName", Toast.LENGTH_SHORT).show();
        }

        else if  (edtPassword.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
        }
        else{
            saveData();
        }
    }
    private void saveData(){
        Prefs.saveEmployeeName(MainActivity.this,edtUserName.getText().toString());
        Prefs.saveEmployeeName(MainActivity.this,edtPassword.getText().toString());
    }
    private void showData(){
        txtW.setText(
                Prefs.getEmployeeUsername(MainActivity.this)+"\n"+
                        Prefs.getEmployeePassword(MainActivity.this));
    }
    }

