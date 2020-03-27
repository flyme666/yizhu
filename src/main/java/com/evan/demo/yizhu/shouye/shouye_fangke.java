package com.evan.demo.yizhu.shouye;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.evan.demo.yizhu.R;

public class shouye_fangke extends AppCompatActivity {
    private int mPreFragmentFlag = 0;
    Fragment[] mFragments =new Fragment[3];
    private void initFragment() {
        mFragments[0] = new fangkejilu_all();
        mFragments[1] = new fangkejilu_shenqing();
        mFragments[2] = new fangkejilu_yichuli();
        initLoadFragment(R.id.fangkejilu_frame, 0, mFragments);
    }
    private void initLoadFragment(int containerId, int showFragment, Fragment... fragments) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        for (int i = 0; i < fragments.length; i++) {
            transaction.add(containerId, fragments[i], fragments[i].getClass().getName());
            if (i != showFragment)
                transaction.hide(fragments[i]);
        }
        transaction.commitAllowingStateLoss();
    }
    private void showAndHideFragment(Fragment show, Fragment hide) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (show != hide)
            transaction.show(show).hide(hide).commitAllowingStateLoss();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouye_fangke);
        ImageButton back = (ImageButton)findViewById(R.id.fangke_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shouye_fangke.this.finish();
            }
        });
        initFragment();
        Button btn_all = (Button)findViewById(R.id.all);
        Button btn_shengqing = (Button)findViewById(R.id.shengqing);
        Button btn_yichuli = (Button)findViewById(R.id.yichuli);
        btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAndHideFragment(mFragments[0], mFragments[mPreFragmentFlag]);
                mPreFragmentFlag = 0;
            }
        });
        btn_shengqing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAndHideFragment(mFragments[1], mFragments[mPreFragmentFlag]);
                mPreFragmentFlag = 1;
            }
        });
        btn_yichuli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAndHideFragment(mFragments[2], mFragments[mPreFragmentFlag]);
                mPreFragmentFlag = 2;
            }
        });

    }
}
