package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    private RadioGroup rgMaritalStatus;
    private ProgressBar progressbar;

    public void onBtnclick(View view){
//        Initialize the text viewer
        TextView vtxtfirstnme =findViewById(R.id.vtxtfirstname);
        TextView vtxtlastname = findViewById(R.id.vtxtlastname);
        TextView vtxtemail = findViewById(R.id.vtxtemail);
        TextView  vtxtusername = findViewById(R.id.vtxtusername);

//        Working with progressbar
        progressbar=findViewById(R.id.progressBar);
//        Working with radio groups
        rgMaritalStatus= findViewById(R.id.rgMaritalStatus);
        rgMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbMarried:
                        Toast.makeText(MainActivity.this, "You are married", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbSingle:
                        Toast.makeText(MainActivity.this, "You are single", Toast.LENGTH_SHORT).show();
                        progressbar.setVisibility(View.VISIBLE);
                        break;
                    case R.id.rbInRel:
                        Toast.makeText(MainActivity.this, "You are in a relationship", Toast.LENGTH_SHORT).show();
                        progressbar.setVisibility(View.GONE);
                        break;
                    default:
                        break;
                }
            }
        });




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
