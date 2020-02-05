package com.evan.demo.yizhu.woshi_fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.evan.demo.yizhu.R;

public class woshi_dengju extends Fragment {
    private View rootView;
    private ImageButton dianshi;
    private ImageButton ding;
    private ImageButton bi;
    private int flag = 0;
    private int flag1 = 0;
    private int flag2 = 0;


    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_woshi_dengju,container,false);
        initUi();
        return rootView;
    }

    private void initUi(){
        //这里写加载布局的代码
        dianshi = (ImageButton)rootView.findViewById(R.id.dianshideng);
        ding = (ImageButton)rootView.findViewById(R.id.dingdeng);
        bi = (ImageButton)rootView.findViewById(R.id.bideng);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
        if(flag == 0 ){
            dianshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            dianshi.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            dianshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            dianshi.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        dianshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == 0 ){
                    dianshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    dianshi.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag = 1;
                }
                else {
                    dianshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    dianshi.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag = 0;
                }

            }
        });


        if(flag1 == 0 ){
            ding.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            ding.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            ding.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            ding.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        ding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag1 == 0 ){
                    ding.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    ding.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag1 = 1;
                }
                else {
                    ding.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    ding.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag1 = 0;
                }

            }
        });

        if(flag2 == 0 ){
            bi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            bi.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            bi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            bi.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag2 == 0 ){
                    bi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    bi.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag2 = 1;
                }
                else {
                    bi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    bi.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag2 = 0;
                }

            }
        });
    }
}
