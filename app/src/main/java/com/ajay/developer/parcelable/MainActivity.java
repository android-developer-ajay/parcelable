package com.ajay.developer.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, age, address, course;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.et_sname);
        age = (EditText) findViewById(R.id.et_sage);
        address = (EditText) findViewById(R.id.et_saddress);
        course = (EditText) findViewById(R.id.et_scource);
        next = (Button) findViewById(R.id.btn_ok);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student(name.getText().toString().trim(), Integer.parseInt(age.getText().toString().trim()), address.getText().toString().trim(), course.getText().toString().trim());
                Intent intent = new Intent(getBaseContext(), ShowData.class);
                // Passing data as a parecelable object to StudentViewActivity
                intent.putExtra("student", student);
                // Opening the activity
                startActivity(intent);
            }
        });
    }
}
