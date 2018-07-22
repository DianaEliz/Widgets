package com.example.diana.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MyAutocompleteTextViewActicity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_autocomplete_text_view_acticity);


        String[] items = {"Cat", "Dog", "Mouse", "Fish"};
        AutoCompleteTextView myAutocomplete = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        myAutocomplete.setAdapter(new ArrayAdapter<>(this, android.R.layout.select_dialog_item, items));
        myAutocomplete.setThreshold(1);


        //get intent data
        Intent myIntent = getIntent();
        String defaultHint = "Bienvenido";

        if(myIntent.hasExtra(MyEditTextActivity.INTENT_KEY)
                && !myIntent.getStringExtra(MyEditTextActivity.INTENT_KEY).equals("")){
            defaultHint = myIntent.getStringExtra(MyEditTextActivity.INTENT_KEY);
        }
        myAutocomplete.setHint(defaultHint);
    }

}
