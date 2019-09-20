package org.techtown.recipe;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

public class noodleActivity extends AppCompatActivity {
    ListView listview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noodle);

        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ramyeon),
                "라면", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.udong),
                "우동", "300칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bibimnoodle),
                "비빔국수", "500칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kimchimalnoodle),
                "김치말이국수", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.janchinoodle),
                "잔치국수", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kalnoodle),
                "칼국수", "266칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ricenoodle),
                "쌀국수", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.spaghetti),
                "스파게티", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.jajangmyeon),
                "짜장면", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.jjambong),
                "짬뽕", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.zzolmyeon),
                "쫄면", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.seafoodmyeon),
                "해물볶음우동", "700칼로리");


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
