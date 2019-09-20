package org.techtown.recipe;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

public class riceActivity extends AppCompatActivity {
    ListView listview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice);

        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.whiterice),
                "쌀밥", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.blackrice),
                "흑미밥", "300칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chalrice),
                "찰밥", "500칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.japchae),
                "잡채밥", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bibimbap),
                "비빔밥", "266칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.eggrice),
                "계란볶음밥", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kimchirice),
                "김치볶음밥", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.curry),
                "카레라이스", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.shrimprice),
                "새우볶음밥", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tunarice),
                "참치주먹밥", "700칼로리");

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