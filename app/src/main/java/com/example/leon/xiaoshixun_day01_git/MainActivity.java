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
        //第二次冲突
        String str1 = "楠神";
        //第三次冲突
        Log.e( "--------------","楠神最爱小燕燕" );
        //第四次提交
        Log.e( "--------------","燕燕最爱小楠神" );
    }
}
