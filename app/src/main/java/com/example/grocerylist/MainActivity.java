package com.example.grocerylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    List<Item> itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.ic_launcher_background, "fruit", "fresh fruits"));
        itemList.add(new Item(R.drawable.ic_launcher_background, "Vegetables", "vegetables"));
        itemList.add(new Item(R.drawable.ic_launcher_background, "Coffee", "Coffee"));
        itemList.add(new Item(R.drawable.ic_launcher_background, "Juice", "Juice"));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);

        myAdapter.setClickListener(this);
    }

    @Override
    public void onClick(View v, int pos) {
        Toast.makeText(this, "You Chose "+ itemList.get(pos).getName(), Toast.LENGTH_SHORT).show();
    }
}