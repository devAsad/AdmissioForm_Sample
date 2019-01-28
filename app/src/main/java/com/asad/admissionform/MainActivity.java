package com.asad.admissionform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8, editText9, editText10;
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.et_sName);
        editText2 = findViewById(R.id.et_fName);
        editText3 = findViewById(R.id.et_phNum);
        editText4 = findViewById(R.id.et_add);
        editText5 = findViewById(R.id.et_Dob);
        editText6 = findViewById(R.id.et_age);
        editText7 = findViewById(R.id.et_mail);
        editText8 = findViewById(R.id.et_10marks);
        editText9 = findViewById(R.id.et_12marks);
        editText10 = findViewById(R.id.et_course);

        button1 = findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sName, sAdd, sFather, sPh, sDob, sAge, sEmail, s10Marks, s12marks, sCourse;
                sName = editText1.getText().toString();
                sFather = editText2.getText().toString();
                sPh = editText3.getText().toString();
                sAdd = editText4.getText().toString();
                sDob = editText5.getText().toString();
                sAge = editText6.getText().toString();
                sEmail = editText7.getText().toString();
                s10Marks = editText8.getText().toString();
                s12marks = editText9.getText().toString();
                sCourse = editText10.getText().toString();

                if (sName.equals("") || sFather.equals("") || sPh.equals("") || sAdd.equals("") || sDob.equals("") || sAge.equals("") || sEmail.equals("") || s10Marks.equals("") || s12marks.equals("") || sCourse.equals("")) {
                    Toast.makeText(MainActivity.this, "Please fill all details ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Your details Submitted ", Toast.LENGTH_SHORT).show();
                }
            }

                }

        );
    }
}
