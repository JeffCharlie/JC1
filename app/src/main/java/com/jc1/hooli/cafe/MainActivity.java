package com.jc1.hooli.cafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    protected List<FoodItem> courseData;

    protected FoodItem Course;
    public final static String EXTRA_FOODITEM_NUMBER = "EXTRA_FOODITEM_NUMBER";
    public final static String EXTRA_TITLE = "EXTRA_TITLE";
    public final static String EXTRA_DESC = "EXTRA_DESC";
    public final static String EXTRA_IMAGE = "EXTRA_IMAGE";
    public final static String EXTRA_COST = "EXTRA_COST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle(getResources().getString(R.string.title_activity_main));

        courseData = DataManager.getData();

        ArrayAdapter<FoodItem> myAdapter = new ArrayAdapter <>(this,
                android.R.layout.simple_list_item_1, courseData);
        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FoodItem course = courseData.get(position);
                displayDetail(course);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml
        int id = item.getItemId();

        // noinspection SimplifiableIfStatement
        // click on action display detail then do display detail method
      if (id == R.id.action_display_detail2) {
            // add about page here in place of the code below
            // displayDetail(courseData.get(0));
          //displayAbout(courseData.get(1));
          Intent intent = new Intent(this, AboutPage.class);
          startActivity(intent);
          return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayDetail(FoodItem course) {

        Intent intent = new Intent(this, FoodItemActivity.class);
        intent.putExtra(EXTRA_FOODITEM_NUMBER, course.getWeissmanScore());
        intent.putExtra(EXTRA_TITLE, course.getTitle());
        intent.putExtra(EXTRA_DESC, course.getDescription());
        intent.putExtra(EXTRA_IMAGE, course.getImageName());
        intent.putExtra(EXTRA_COST, course.getCost());

        startActivity(intent);
    }


    public void displayAbout(FoodItem course) {

        Intent intent = new Intent(this, AboutActivity.class);
        intent.putExtra(EXTRA_FOODITEM_NUMBER, course.getWeissmanScore());
        intent.putExtra(EXTRA_TITLE, course.getTitle());
        intent.putExtra(EXTRA_DESC, course.getDescription());
        intent.putExtra(EXTRA_IMAGE, course.getImageName());
        intent.putExtra(EXTRA_COST, course.getCost());

        startActivity(intent);
    }

}
