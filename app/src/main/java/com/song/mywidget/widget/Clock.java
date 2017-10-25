package com.song.mywidget.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by song on 2017/10/24.
 */
public class Clock extends View {

    public Clock(Context context) {
        super(context);
    }
    public Clock(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public Clock(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        int mWidth = getMeasuredWidth();
        int mHeight = getMeasuredHeight();

        Paint paintCircle = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintCircle.setStyle(Paint.Style.STROKE);
        paintCircle.setStrokeWidth(5);
        canvas.drawCircle(mWidth / 2, mHeight / 2, mWidth / 2, paintCircle);

        Paint paintDegree = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintCircle.setStrokeWidth(3);

        for (int i=0;i<12;i++){

            if (i==0||i==3||i==9){

                paintCircle.setStrokeWidth(5);
                paintDegree.setTextSize(30);
                //画特殊刻度
                canvas.drawLine(mWidth / 2, mHeight / 2 - mWidth / 2, mWidth / 2, mHeight / 2 - mWidth / 2 + 60, paintDegree);
                String degree = String.valueOf(i);
                //画刻度值,注意X轴坐标
                canvas.drawText(degree, mWidth / 2 - paintDegree.measureText(degree) / 2, mHeight / 2 - mWidth / 2 + 90, paintDegree);

            }else if(i==6){
                paintCircle.setStrokeWidth(5);
                paintDegree.setTextSize(30);
                //画特殊刻度
                canvas.drawLine(mWidth / 2, mHeight / 2 - mWidth / 2, mWidth / 2, mHeight / 2 - mWidth / 2 + 60, paintDegree);
                String degree = String.valueOf(9);
                //画刻度值,注意X轴坐标
                canvas.drawText(degree, mWidth / 2 - paintDegree.measureText(degree) / 2, mHeight / 2 - mWidth / 2 + 90, paintDegree);
            } else{
                paintDegree.setTextSize(15);
                //画普通刻度
                canvas.drawLine(mWidth / 2, mHeight / 2 - mWidth / 2, mWidth / 2, mHeight / 2 - mWidth / 2 + 30, paintDegree);
                String degree = String.valueOf(i);
                //画刻度值,注意X轴坐标
                canvas.drawText(degree, mWidth / 2 - paintDegree.measureText(degree) / 2, mHeight / 2 - mWidth / 2 + 60, paintDegree);

            }
            //绕原点旋转15度
            canvas.rotate(30, mWidth / 2, mHeight / 2);

        }

        //时针指针
        Paint paintHour = new Paint();
        paintHour.setStrokeWidth(20);
        //分针指针
        Paint paintMinute = new Paint();
        paintMinute.setStrokeWidth(10);

        canvas.drawLine(mWidth / 2, mHeight / 2, mWidth / 2 + 100, mHeight / 2 + 100, paintHour);
        canvas.drawLine(mWidth / 2, mHeight / 2,mWidth / 2+100,mHeight / 2+200,paintMinute);

        canvas.save();

    }
}
