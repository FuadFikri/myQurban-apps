package com.fikri.myqurban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.fikri.myqurban.adapter.ListHewanAdapter;
import com.fikri.myqurban.model.Hewan;
import com.fikri.myqurban.model.HewanData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHewan;
    private ArrayList<Hewan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHewan = findViewById(R.id.rv_hewan);
        rvHewan.setHasFixedSize(true);

        list.addAll(HewanData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
            Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(aboutIntent);
            break;

        }
    }

    private void showRecyclerList(){
        rvHewan.setLayoutManager(new LinearLayoutManager(this));
        ListHewanAdapter listHeroAdapter = new ListHewanAdapter(list);
        rvHewan.setAdapter(listHeroAdapter);
    }
}
