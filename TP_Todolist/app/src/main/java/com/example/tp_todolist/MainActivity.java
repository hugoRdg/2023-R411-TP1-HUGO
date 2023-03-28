package com.example.tp_todolist;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayAdapter<Task> adapter;
    private TaskList taskList = new FacticeStorageTasks().ReadTasks();
    private ListView listviewTask;
    private ImageButton addImageButton;
    private int currentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listviewTask = findViewById(R.id.List);
        addImageButton = findViewById(R.id.AddImageButton);

        adapter = new ArrayAdapter<Task>(this, android.R.layout.simple_list_item_1, taskList.getTask());

        listviewTask.setAdapter(adapter);
        listviewTask.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        Intent intent = new Intent(this,EditTaskActivity.class);
        Task task = taskList.getTask().get(i);
        currentIndex=i;

        intent.putExtra("task",task);
        startActivityForResult(intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0)
        {
            if(resultCode==1)
            {
                Task task =
                        (Task)data.getExtras().getSerializable("task");
            }
        }
    }

}