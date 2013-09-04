package com.example.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndexActivity extends Activity {


    private Button index_button;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        index_button = (Button) findViewById(R.id.index_button);
        index_button.setOnClickListener(index_button_OnClickListener);
    }

    View.OnClickListener index_button_OnClickListener = new View.OnClickListener() {


        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            String name_value = "IndexActivity-global";
            ((AndroidGlobalApplication) getApplication()).name_key = name_value;

            //intent.putExtra(name_key, name_value);
            intent.setClass(IndexActivity.this, SecondActivity.class);
            startActivity(intent);
        }
    };
}
