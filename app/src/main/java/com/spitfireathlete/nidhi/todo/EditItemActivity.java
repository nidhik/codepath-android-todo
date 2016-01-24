package com.spitfireathlete.nidhi.todo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EditItemActivity extends AppCompatActivity {

    private EditText etEditItem;
    private EditText etEditNotes;
    private DatePicker dpDeadline;
    private RadioGroup rgPriority;

    private int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String itemText = getIntent().getStringExtra("itemText");
        String notes = getIntent().getStringExtra("itemNotes");


        Calendar due = new GregorianCalendar();
        due.setTimeInMillis(getIntent().getLongExtra("dateInMillis", -1));

        pos = getIntent().getIntExtra("itemPosition", 0);

        etEditItem = (EditText) findViewById(R.id.etEditItem);
        etEditItem.setText(itemText);

        etEditNotes = (EditText) findViewById(R.id.etNotes);
        etEditNotes.setText(notes);

        dpDeadline = (DatePicker) findViewById(R.id.dpDeadline);
        dpDeadline.updateDate(due.get(Calendar.YEAR), due.get(Calendar.MONTH), due.get(Calendar.DAY_OF_MONTH));

        rgPriority = (RadioGroup) findViewById(R.id.rgPriority);

        etEditItem.requestFocus();
    }

    public void onSubmit(View v) {
        Intent intent = new Intent();

        String newItemText = etEditItem.getText().toString();
        String newItemNotes = etEditNotes.getText().toString();
        intent.putExtra("newItemText", newItemText);
        intent.putExtra("newItemNotes", newItemNotes);
        intent.putExtra("itemPosition", pos);
        setResult(RESULT_OK, intent);

        this.finish();
    }

}
