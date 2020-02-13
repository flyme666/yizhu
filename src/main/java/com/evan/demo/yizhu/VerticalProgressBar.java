package com.evan.demo.yizhu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class VerticalProgressBar extends View {
    private Paint paint;// 画笔
    private int progress;// 进度值
    private int width;// 宽度值
    private int height;// 高度值

    public VerticalProgressBar(Context context, AttributeSet attrs,
                               int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public VerticalProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VerticalProgressBar(Context context) {
        super(context);
        init();
    }

    private void init() {
        paint = new Paint();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        width = getMeasuredWidth() - 1;// 宽度值
        height = getMeasuredHeight() - 1;// 高度值
    }

    @Override
    protected void onDraw(Canvas canvas) {

        paint.setColor(Color.BLACK);
//        paint.setColor(Color.rgb(214, 214, 214));// 设置画笔颜色
        canvas.drawRoundRect(new RectF(0, height, width, height), 30, 30, paint);

        paint.setColor(Color.rgb(114, 171, 121));// 设置画笔颜色
        canvas.drawRoundRect(new RectF(0, height - progress / 100f * height, width, height), 30, 30, paint);

        paint.setColor(Color.WHITE);// 设置画笔颜色为红色
        paint.setTextSize(width / 5);// 设置文字大小
        canvas.drawText(progress + "%",
                (width - getTextWidth(progress + "%")) / 2, height / 2, paint);// 画文字
        super.onDraw(canvas);
    }


    /**
     * 拿到文字宽度
     *
     * @param str 传进来的字符串
     *            return 宽度
     */
    private int getTextWidth(String str) {
        // 计算文字所在矩形，可以得到宽高
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    /**
     * 设置progressbar进度
     */
    public void setProgress(int progress) {
        this.progress = progress;
        postInvalidate();
    }
}
