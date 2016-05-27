package com.amili.gitnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private long lastTime;
    @Override
    public void onBackPressed() {
        long ct=System.currentTimeMillis();
        super.onBackPressed();
        if(ct-lastTime>200){
            Toast.makeText(this,"点击后退",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"再次点击后退",Toast.LENGTH_LONG).show();
        }
    }
}
