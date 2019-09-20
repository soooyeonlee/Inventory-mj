package org.techtown.recipe;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

public class meatActivity extends AppCompatActivity {
    ListView listview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);

        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chickenbokkem),
                "닭볶음탕", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.piggalbizzim),
                "돼지갈비찜", "300칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sogalbizzim),
                "소갈비찜", "500칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kimchizzim),
                "김치찜", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bulgoggi),
                "불고기", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.jaeyook),
                "제육볶음", "266칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.yookhwae),
                "육회", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.soyook),
                "수육", "700칼로리");




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