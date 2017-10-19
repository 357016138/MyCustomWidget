package com.song.mywidget.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;

/**
 * Created by song on 2017/10/19.
 */
public class MyTextView extends TextView{
    private  Paint mPaint1;
    private  Paint mPaint2;

    public MyTextView(Context context) {
        super(context);
        mPaint1 = new Paint();
        mPaint1.setColor(getResources().getColor(android.R.color.holo_orange_dark));
        mPaint1.setStyle(Paint.Style.FILL);
        mPaint2 = new Paint();
        mPaint2.setColor(getResources().getColor(android.R.color.holo_orange_dark));
        mPaint2.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawRect(0, 0, getMeasuredWidth(), getMeasuredHeight(), mPaint1);
        canvas.drawRect(10, 10, getMeasuredWidth() - 10, getMeasuredHeight() - 10, mPaint2);
        canvas.save();
        canvas.translate(10,0);
        super.onDraw(canvas);

    }
}
