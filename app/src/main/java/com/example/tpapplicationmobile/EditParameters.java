package com.example.tpapplicationmobile;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RatingBar;

public class EditParameters extends AppCompatActivity {

    private EditText title;
    private EditText description;
    private ImageButton returnButton;
    private RatingBar ratingBar;
    private Task task;

    /**
     * Constructeur
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_parameters);

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
        this.returnButton.setOnClickListener(this::onClickButton);
    }

    /**
     * Modification de nos informations
     * @param v
     */
    public void onClickButton(View v)
    {
            task.setTitle(title.getText().toString());
            task.setDescription(description.getText().toString());
            task.setPriority((int) ratingBar.getRating());

            Intent intent = new Intent();
            intent.putExtra("task",task);
            setResult(1,intent);
            finish();
    }

    /**
     * OnActivityResult
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0)
        {
            if(resultCode==1)
            {
                Task task = (Task)data.getExtras().getSerializable("task");
            }
        }
    }
}