package com.mkemp.bindingdemo1java;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    private TextView nameText;
    private TextView emailText;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        nameText = findViewById(R.id.tvStudentName);
        emailText = findViewById(R.id.tvStudentEmail);
        
        nameText.setText(getCurrentStudent().getStudentName());
        emailText.setText(getCurrentStudent().getStudentEmail());
    }
    
    private Student getCurrentStudent()
    {
        Student student = new Student();
        student.setStudentName("Koda");
        student.setStudentEmail("KodaK@gmail.com");
        return student;
    }
}