package com.evan.demo.yizhu.wode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.evan.demo.yizhu.R;

public class wode_renlianrenzheng extends AppCompatActivity {
    private TextView tiaoguo;
    private Button back;
    private Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wode_renlianrenzheng);
        tiaoguo = (TextView)findViewById(R.id.tiaoguo);
        back = (Button)findViewById(R.id.wode_back);
        save = (Button)findViewById(R.id.renlianrenzheng_save) ;
        tiaoguo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wode_renlianrenzheng.this.finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wode_renlianrenzheng.this.finish();
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(wode_renlianrenzheng.this,"保存成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
