package org.techtown.recipe;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

public class fishActivity extends AppCompatActivity {
    ListView listview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);

        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.galchigooi),
                "갈치구이", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.galchijorim),
                "갈치조림", "300칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.godeungugooi),
                "고등어구이", "500칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.godeungujorim),
                "고등어조림", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.samchigooi),
                "삼치구이", "266칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.samchijorim),
                "삼치조림", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ggonchigooi),
                "꽁치구이", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ggonchijorim),
                "꽁치조림", "700칼로리");



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