package com.sourav.adypu_sourav;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


public class LoginActivity extends AppCompatActivity {
        edtUsername=findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPassword);
        signUp=findViewById(R.id.txtSignUp);
        btnLogin=findViewById(R.id.btnLogIn);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle=new Bundle();
                bundle.putString("callFrom","login");

                Intent intent=new Intent(LoginActivity.this,RegistrationActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}