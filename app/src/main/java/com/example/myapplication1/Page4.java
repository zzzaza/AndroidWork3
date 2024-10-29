package com.example.myapplication1;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Page4 extends AppCompatActivity implements View.OnClickListener {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> items;
    private ActionMode actionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btnpage4);

        listView = findViewById(R.id.list_view);
        items = new ArrayList<>();
        items.add("One");
        items.add("Two");
        items.add("Three");
        items.add("Four");
        items.add("Five");

        adapter = new ArrayAdapter<>(this, R.layout.list_item2, R.id.text_item, items);
        listView.setAdapter(adapter);

        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        listView.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {
                int selectedCount = listView.getCheckedItemCount();
                mode.setTitle(selectedCount + " selected");
            }

            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                getMenuInflater().inflate(R.menu.page4_menu, menu);
                actionMode = mode;
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                if (item.getItemId() == R.id.action_delete) {
                    deleteSelectedItems();
                    mode.finish();
                    return true;
                }
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {
                actionMode = null;
            }
        });
    }

    private void deleteSelectedItems() {
        for (int i = listView.getCount() - 1; i >= 0; i--) {
            if (listView.isItemChecked(i)) {
                items.remove(i);
            }
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View view) {

    }
}

