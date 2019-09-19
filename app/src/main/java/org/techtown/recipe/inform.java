package org.techtown.recipe;

import android.content.res.TypedArray;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class inform extends AppCompatActivity {
    ListView listview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inform);

        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chicken),
                "chicken", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.cake),
                "cake", "300칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.spaghetti),
                "spaghetti", "500칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.salad),
                "salad", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.taco),
                "taco", "266칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pizza),
                "pizza", "700칼로리");
        EditText editTextFilter = (EditText)findViewById(R.id.editTextFilter);
        editTextFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable edit) {
                String filterText = edit.toString() ;
                ((ListViewAdapter)listview.getAdapter()).getFilter().filter(filterText) ;
            }
        });
    }
}