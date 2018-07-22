package com.example.diana.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class MyEditTextActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText myText;
    public static final String INTENT_KEY = "NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_edit_text);

        myText = findViewById(R.id.myText);
        findViewById(R.id.btnShow).setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        String textInput = myText.getText().toString();

        //para pasar datos de una a otra
        Intent i = new Intent(this, AutoCompleteTextView.class);
        i.putExtra(INTENT_KEY, textInput);

        startActivity(i);


        //el codigo original de edit text
        //Toast.makeText(this, textInput, Toast.LENGTH_SHORT).show();
    }

}
