package com.evan.demo.yizhu;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.evan.demo.yizhu.yushi_fragment.yushi_dengju;
import com.evan.demo.yizhu.yushi_fragment.yushi_paifengshan;
import com.evan.demo.yizhu.yushi_fragment.yushi_tizhongcheng;

import java.util.ArrayList;


public class ShouyeFragment extends Fragment {
    private View rootView;
    private TextView shuaxing;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_shouye,container,false);
        initUi();
        return rootView;
    }


    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    private void initUi(){
        //这里写加载布局的代码
        shuaxing = (TextView)rootView.findViewById(R.id.shouye_shuaxing);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
        createLink();

    }
    private void createLink() {
        // 创建一个 SpannableString对象
        SpannableString sp = new SpannableString("点击刷新");
        // 设置超链接
        sp.setSpan(new URLSpan("http://www.baidu.com"), 0, 4,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        shuaxing.setText(sp);
        shuaxing.setMovementMethod(LinkMovementMethod.getInstance());
    }

}