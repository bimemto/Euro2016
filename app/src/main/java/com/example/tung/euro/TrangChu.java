package com.example.tung.euro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TabHost;

public class TrangChu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TabHost tabHost=(FragmentTabHost) findViewById(R.id.tabHostTrangChu);
        //Tin Tuc
        TabHost.TabSpec tintucspec =tabHost.newTabSpec("Tin Tuc");
        tintucspec.setIndicator("Tin Tuc",getResources().getDrawable());
        Intent tintucIntent = new Intent(this,TinTuc.class);
        tintucspec setContent(tintucIntent);
        //lich Thi Dau
        TabHost.TabSpec lichthidauspec =tabHost.newTabSpec("Lich Thi Dau");
        tintucspec.setIndicator("Lich Thi Dau",getResources().getDrawable());
        Intent lichthidauIntent = new Intent(this,LichThiDau.class);
        lichthidauspec setContent(lichthidauIntent);
        //Bang Xep Hang
        TabHost.TabSpec bangxephangspec =tabHost.newTabSpec("Bang Xep Hang");
        bangxephangspec.setIndicator("Bang Xep Hang",getResources().getDrawable());
        Intent bangxephangIntent = new Intent(this,BangXepHang.class);
        bangxephangspec setContent(bangxephangIntent);


        tabHost.addTab(tintucspec);
        tabHost.addTab(bangxephangspec);
        tabHost.addTab(lichthidauspec);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}
