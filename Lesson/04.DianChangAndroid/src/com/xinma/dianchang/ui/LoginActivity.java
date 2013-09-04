package com.xinma.dianchang.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.xinma.dianchang.R;

/**
 * Created with IntelliJ IDEA.
 * User: xuxy
 * Date: 13-8-29
 * Time: 下午2:42
 * To change this template use File | Settings | File Templates.
 */
public class LoginActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.xc_login_activity);

        Button loginBtn = (Button) findViewById(R.id.loginbtn);

        loginBtn.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            toggleActivity();
        }
    };

    private void toggleActivity() {
        Intent intent = new Intent();
        intent.setClass(this, DefalutActivity.class);
        intent.putExtra("test", "testValue");

        startActivity(intent);
    }

    private void toggleActivity123() {
        Intent intent = new Intent(this, DefalutActivity.class);
        Bundle bundleData = new Bundle();
        bundleData.putString("test", "testValue");
        intent.putExtras(bundleData);
        //intent.putstrin
        startActivity(intent);
    }
}
