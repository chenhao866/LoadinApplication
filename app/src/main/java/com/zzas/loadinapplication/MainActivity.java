package com.zzas.loadinapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kanyuan.kyloading.KyLoadingBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KyLoadingBuilder builder = new KyLoadingBuilder(this);
        builder.setIcon(R.mipmap.password);
        builder.setText("正在加载中...");
        builder.setIconWidth(120);
        builder.setIconHeight(120);
        builder.setOutsideTouchable(false);//点击空白区域是否关闭
        builder.show();


    }


}
