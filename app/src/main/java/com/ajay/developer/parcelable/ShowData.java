package com.ajay.developer.parcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {
    private TextView name, age, course, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        name = (TextView) findViewById(R.id.tv_sname);
        age = (TextView) findViewById(R.id.tv_sage);
        address = (TextView) findViewById(R.id.tv_saddress);
        course = (TextView) findViewById(R.id.tv_scourse);

        Student student = getIntent().getParcelableExtra("student");
        name.setText(student.mSName);
        age.setText("" + student.mSAge);
        address.setText(student.mSAddress);
        course.setText(student.mSCourse);

    }
}
