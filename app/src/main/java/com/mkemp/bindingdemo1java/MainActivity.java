package com.mkemp.bindingdemo1java;

import android.os.Bundle;

import com.mkemp.bindingdemo1java.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding activityMainBinding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setStudent(getCurrentStudent());
    }
    
    private Student getCurrentStudent()
    {
        Student student = new Student();
        student.setStudentName("Koda");
        student.setStudentEmail("KodaK@gmail.com");
        return student;
    }
}