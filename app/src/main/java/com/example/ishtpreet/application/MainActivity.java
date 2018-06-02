package com.example.ishtpreet.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private GridLayoutManager mLayoutManager;


    String[] Names={"CANDLE","CAKE","PASTRY","PARTY POPPERS","OTHERS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList =new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.donut, "Sweetsy Special Donut ", "₹ 80" ));
        exampleList.add(new ExampleItem(R.drawable.pastry, "Pastry","₹ 55"));
        exampleList.add(new ExampleItem(R.drawable.chocolate, "Choco Lava Cake", "₹ 500" ));
        exampleList.add(new ExampleItem(R.drawable.cake,"Sweetsy Special Cake","₹ 529"));



        mRecyclerView = findViewById(R.id.RecyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this,2);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        Spinner spin = (Spinner) findViewById(R.id.abc);
        spin.setOnItemSelectedListener(this);


        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Names);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(aa);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.task1,menu);
        inflater.inflate(R.menu.task2,menu);
        inflater.inflate(R.menu.task3,menu);
        inflater.inflate(R.menu.credits,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Toast.makeText(getApplicationContext(), Names[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}