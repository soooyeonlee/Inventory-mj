package org.techtown.recipe;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

public class soupActivity extends AppCompatActivity {
    ListView listview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup);

        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kimchisoup),
                "김치찌개", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.djsoup),
                "된장찌개", "300칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kongnamulsoup),
                "콩나물국", "500칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.eggsoup),
                "계란국", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.miyeoksoup),
                "미역국", "266칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.soondofu),
                "순두부찌개", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.budaesoup),
                "부대찌개", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chungsoup),
                "청국장", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.galbitang),
                "갈비탕", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.serrungtang),
                "설렁탕", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.squidsoup),
                "오징어찌개", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ukgaejang),
                "육계장", "700칼로리");

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