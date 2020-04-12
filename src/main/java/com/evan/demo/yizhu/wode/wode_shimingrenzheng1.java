package com.evan.demo.yizhu.wode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.evan.demo.yizhu.R;

public class wode_shimingrenzheng1 extends AppCompatActivity {

    private TextView tiaoguo;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wode_shimingrenzheng1);
        tiaoguo = (TextView)findViewById(R.id.tiaoguo);
        back = (Button)findViewById(R.id.wode_back);
        tiaoguo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wode_shimingrenzheng1.this.finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wode_shimingrenzheng1.this.finish();
            }
        });
    }
}
