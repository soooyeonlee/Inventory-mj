package org.techtown.recipe;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

public class sidedishesActivity extends AppCompatActivity {
    ListView listview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidedishes);

        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.myeolchi),
                "멸치볶음", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.umook),
                "어묵볶음", "300칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kongjaban),
                "콩자반", "500칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.oimuchim),
                "오이무침", "100칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.squidmuchim),
                "오징어채 볶음", "266칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.hobakmuchim),
                "호박볶음", "700칼로리");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bookuchaemuchim),
                "북어채무침", "700칼로리");



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
