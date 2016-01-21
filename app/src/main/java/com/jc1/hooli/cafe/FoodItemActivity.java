package com.jc1.hooli.cafe;

import android.content.Intent;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;


public class FoodItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_item);

        Intent intent = getIntent();
        FoodItem course = new FoodItem(intent);

        TextView tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvTitle.setText(course.getTitle());

        TextView tvDesc = (TextView) findViewById(R.id.tvDescription);
        tvDesc.setText(course.getDescription());

        TextView tvWeissmanScore = (TextView) findViewById(R.id.tvWeissmanScore);
        tvWeissmanScore.setText("Weissman Score: " + course.getWeissmanScore());

        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setMinimumFractionDigits(1);
        TextView tvCost = (TextView) findViewById(R.id.tvCost);
        tvCost.setText("Cost: " + formatter.format(course.getCost()));

        int imageId = getResources().getIdentifier(
                course.getImageName(), "drawable", getPackageName());
        if (imageId != 0) {
            ImageView iv = (ImageView) findViewById(R.id.imageView);
            iv.setImageResource(imageId);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_food_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement test
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
