package com.example.leon.xiaoshixun_day01_git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        //修改过后的代码
        Toast.makeText( this, "男神最爱小燕燕", Toast.LENGTH_SHORT ).show();
        String str="aa";
    }
}
