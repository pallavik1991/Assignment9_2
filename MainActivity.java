package com.example.vaio.assignment9_2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        menu.add(Menu.NONE,1,Menu.NONE,"Computer");
        menu.add(Menu.NONE,1,Menu.NONE,"Gamepad");
        menu.add(Menu.NONE,1,Menu.NONE,"Camera");
        menu.add(Menu.NONE,1,Menu.NONE,"Video");
        menu.add(Menu.NONE,1,Menu.NONE,"Email");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        CharSequence selected=item.getTitleCondensed();
        //noinspection SimplifiableIfStatement
        Toast.makeText(getApplicationContext(),selected,Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }
}
