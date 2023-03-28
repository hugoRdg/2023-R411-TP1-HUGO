package com.example.tpapplicationmobile;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    //Adapteur
    private ArrayAdapter<Task> adapter;

    //Liste pour les tâches factices
    private TaskList taskList = new FacticeStorageTasks().ReadTasks();

    //Affichage liste des tâches
    private ListView listviewTask;

    //Image pour l'ajout de tâches
    private ImageButton addImageButton;

    //index
    private int currentIndex;

    //Stockage des tâches
    private IStorageTasks storageTasks;

    /**
     * Constructeur
     * @param savedInstanceState
     */
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

    /**
     * onItemClick, va nous permettre de gérer l'accès à la seconde page
     * @param adapterView
     * @param view
     * @param i
     * @param l
     */
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Task task = taskList.getTask().get(i);
        currentIndex = i;
        Intent intent = new Intent(this,EditParameters.class);
        intent.putExtra("task",task);
        startActivityForResult(intent,0);
    }

    /**
     * OnActivityResult, va nous permettre de récupérer les tâches
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0)
        {
            if(resultCode==1)
            {
                Task task = (Task)data.getExtras().getSerializable("task");
                this.taskList.getTask().set(currentIndex,task);
                adapter.notifyDataSetChanged();
                this.storageTasks.UpdateTask(task);
            }
        }
        else if(requestCode==2)
        {
            if(resultCode==1) // le code utilisé par le setResult dans l'autre
            {
                Task task = (Task)data.getExtras().getSerializable("task");
                adapter.add(task);
                this.storageTasks.AddTask(task);
            }
        }
    }
}