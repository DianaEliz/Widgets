package com.example.diana.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        findViewById(R.id.myTextViewActivity).setOnClickListener(this);
        findViewById(R.id.myImageViewActivity).setOnClickListener(this);
        findViewById(R.id.myEditTextViewActivity).setOnClickListener(this);
        findViewById(R.id.myAutocompleteTextActivity).setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.myTextViewActivity:

                startActivity(new Intent(this, MyTextViewActivity.class));
                break;
            case R.id.myImageViewActivity:
                startActivity(new Intent( this, MyImageViewActivity.class));
                break;
            case R.id.myEditTextViewActivity:
                startActivity(new Intent( this, MyEditTextActivity.class));
                break;
            case R.id.myAutocompleteTextActivity:
                startActivity(new Intent( this, MyAutocompleteTextViewActicity.class));
                break;

        }
    }
}
