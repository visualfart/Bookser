package com.neelanksachan.scanner_module;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class bookserUI extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Neelank Log", "Start 1");
        setContentView(R.layout.activity_bookser_ui);
        Log.d("Neelank Log", "Start 2");
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        Log.d("Neelank Log", "Start 3");
        rv.setHasFixedSize(true);
        Log.d("Neelank Log", "starting");
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        initializeData();
        Log.d("Neelank Log", "Initialized");
        RVAdapter adapter = new RVAdapter(persons);
        Log.d("Neelank Log", "got the adapter");
        rv.setAdapter(adapter);
    }


    private List<Person> persons;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.harry_potter));
        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.harry_potter));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.harry_potter));
        persons.add(new Person("Neelank Sachan", "23 years old", R.mipmap.harry_potter));
        persons.add(new Person("Neelank Sachan", "23 years old", R.mipmap.harry_potter));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bookser_ui, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}