package com.example.tp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RatingBar;

public class EditTaskActivity extends AppCompatActivity {

    private EditText title;
    private EditText description;
    private ImageButton returnButton;
    private RatingBar ratingBar;
    private Task task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.title = findViewById(R.id.editTitleText);
        this.description = findViewById(R.id.editDescriptionText);
        this.returnButton = findViewById(R.id.returnButon);
        this.ratingBar = findViewById(R.id.ratingBar);

        Intent intent = getIntent();
        Bundle params = intent.getExtras();
        task = (Task)params.getSerializable("task");

        this.title.setText(task.getTitle());
        this.description.setText(task.getDescription());
        this.ratingBar.setRating(task.getPriority());
    }
}