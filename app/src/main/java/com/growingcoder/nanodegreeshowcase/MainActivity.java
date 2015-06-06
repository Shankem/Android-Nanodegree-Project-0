package com.growingcoder.nanodegreeshowcase;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastButtonClickListener clickListener = new ToastButtonClickListener();

        findViewById(R.id.button_spotify_streamer).setOnClickListener(clickListener);
        findViewById(R.id.button_football_scores).setOnClickListener(clickListener);
        findViewById(R.id.button_library).setOnClickListener(clickListener);
        findViewById(R.id.button_build_it_bigger).setOnClickListener(clickListener);
        findViewById(R.id.button_xyz_reader).setOnClickListener(clickListener);
        findViewById(R.id.button_capstone).setOnClickListener(clickListener);
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
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Click listener used to handle displaying a toast for a button.
     */
    private class ToastButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Integer stringId = null;
            switch (v.getId()) {
                case R.id.button_spotify_streamer:
                    stringId = R.string.app_description_spotify_streamer;
                    break;
                case R.id.button_football_scores:
                    stringId = R.string.app_description_football_scores;
                    break;
                case R.id.button_library:
                    stringId = R.string.app_description_library;
                    break;
                case R.id.button_build_it_bigger:
                    stringId = R.string.app_description_build_it_bigger;
                    break;
                case R.id.button_xyz_reader:
                    stringId = R.string.app_description_xyz_reader;
                    break;
                case R.id.button_capstone:
                    stringId = R.string.app_description_capstone;
                    break;
                default:
                    break;
            }

            if (stringId != null) {
                Toast.makeText(getApplicationContext(), stringId, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
