package com.example.myzxingtwo;

import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;


/**
 * Created by YiBei on 2017/12/14.
 * 第一次提交文件夹有问题
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_NoActionBar);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){ //android 4.4
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);//状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        //activity跳转动画
        overridePendingTransition(R.anim.activity_open, 0);
        
        initView();
        initListener();








    }



    private void initView() {}

    private void initListener() {}

    Toast toast = null;

    protected void Toast(String s){
        if(toast == null){
            toast = Toast.makeText(this, s , Toast.LENGTH_LONG);
            toast.show();
        }else{
            toast.setText(s);
            toast.show();
        }
    }




}
