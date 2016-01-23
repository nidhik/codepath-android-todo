package com.spitfireathlete.nidhi.todo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    private EditText etEditItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String itemText = getIntent().getStringExtra("itemText");
        int pos = getIntent().getIntExtra("itemPosition", 0);

        etEditItem = (EditText) findViewById(R.id.etEditItem);
        etEditItem.setText(itemText);
    }

    public void onSubmit(View v) {
        // closes the activity and returns to first screen
        this.finish();
    }

}
