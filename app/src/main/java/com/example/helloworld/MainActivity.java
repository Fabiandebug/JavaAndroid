package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtnclick(View view){
//        Initialize the text viewer
        TextView vtxtfirstnme =findViewById(R.id.vtxtfirstname);
        TextView vtxtlastname = findViewById(R.id.vtxtlastname);
        TextView vtxtemail = findViewById(R.id.vtxtemail);
        TextView  vtxtusername = findViewById(R.id.vtxtusername);
//Initialize the text editor
        EditText txtusername =findViewById(R.id.edittxtname);
        EditText txtfirstname = findViewById(R.id.edittxtFirstname);
        EditText txtlastname = findViewById(R.id.edittxtlastname);
        EditText txtemail = findViewById(R.id.edittxtemail);

//        Pass data to the TextViewer

        vtxtfirstnme.setText(txtfirstname.getText().toString());
        vtxtlastname.setText(txtlastname.getText().toString());
        vtxtemail.setText(txtemail.getText().toString());
        vtxtusername.setText(txtusername.getText().toString());

    }
}