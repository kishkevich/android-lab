package com.example.inna.cat_directory;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView mName = (TextView) findViewById(R.id.textName);
        TextView mDescription = (TextView) findViewById(R.id.textDescription);
        TextView mCharacter = (TextView) findViewById(R.id.textCharacter);
        String name = "";
        String description = "";
        String character = "";
        CatsInfo mydocuments = (CatsInfo)getIntent().getParcelableExtra("CatsInfo");
        name = mydocuments.getCatName();
        description = mydocuments.getDescription();
        character = mydocuments.getCharacter();
        mName.setText("Порода:" + name);
        mDescription.setText("Описание:" + description);
        mCharacter.setText("Характер:" + character);

    }
}
