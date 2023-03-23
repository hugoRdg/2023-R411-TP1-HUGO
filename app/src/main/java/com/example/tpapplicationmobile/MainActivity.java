package com.example.tpapplicationmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private ArrayAdapter<Task> adapter;
    private TaskList taskList = new FacticeStorageTasks().ReadTasks();
    private ListView listviewTask;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listviewTask = findViewById(R.id.List);
        adapter = new ArrayAdapter<Task>(this,
                android.R.layout.simple_list_item_1, taskList.getTask());
        listviewTask.setAdapter(adapter);
        taskList.setOnItemClickListener(this);
    }
}