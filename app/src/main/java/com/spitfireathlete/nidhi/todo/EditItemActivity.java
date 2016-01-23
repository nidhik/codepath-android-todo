package com.spitfireathlete.nidhi.todo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    private EditText etEditItem;
    private int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String itemText = getIntent().getStringExtra("itemText");
        pos = getIntent().getIntExtra("itemPosition", 0);

        etEditItem = (EditText) findViewById(R.id.etEditItem);
        etEditItem.setText(itemText);

        etEditItem.requestFocus();
    }

    public void onSubmit(View v) {
        Intent intent = new Intent();

        String newItemText = etEditItem.getText().toString();
        intent.putExtra("newItemText", newItemText);
        intent.putExtra("itemPosition", pos);
        setResult(RESULT_OK, intent);

        this.finish();
    }

}
