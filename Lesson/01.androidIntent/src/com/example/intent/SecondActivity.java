package com.example.intent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 8/22/13
 * Time: 12:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);

        //Intent intent = getIntent();
        //String name = intent.getExtras().getString("name");
        String name = ((AndroidGlobalApplication) getApplication()).name_key;

        Button second_button = (Button) findViewById(R.id.second_button);

        second_button.setText(name);

        System.out.printf("second activity,name=" + name);

    }
}
