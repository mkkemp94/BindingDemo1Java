package com.mkemp.bindingdemo1java;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mkemp.bindingdemo1java.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding activityMainBinding;
    private MainActivityClickHandlers handlers;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    
        handlers = new MainActivityClickHandlers(this);
        
        activityMainBinding.setStudent(getCurrentStudent());
        activityMainBinding.setClickHandler(handlers);
    }
    
    private Student getCurrentStudent()
    {
        Student student = new Student();
        student.setStudentName("Koda");
        student.setStudentEmail("KodaK@gmail.com");
        return student;
    }
    
    public class MainActivityClickHandlers
    {
        Context context;
    
        public MainActivityClickHandlers(Context context)
        {
            this.context = context;
        }
        
        public void onEnrollButtonClicked(View view)
        {
            Toast.makeText(context, "Enroll clicked", Toast.LENGTH_LONG).show();
        }
    
        public void onCancelButtonClicked(View view)
        {
            Toast.makeText(context, "Cancel clicked", Toast.LENGTH_LONG).show();
        }
    }
}