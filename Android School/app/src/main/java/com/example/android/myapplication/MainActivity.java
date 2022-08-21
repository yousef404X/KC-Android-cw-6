package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Students> studentlist = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);

        Students s1 = new Students("يوسف",14,12,R.drawable.boy1);
        Students s2 = new Students("سلمان",13,10,R.drawable.boy1);
        Students s3 = new Students("ماجد",15,11,R.drawable.boy1);
        Students s4 = new Students("فهد",16,15,R.drawable.boy1);

        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        studentlist.add(s4);



    }
}