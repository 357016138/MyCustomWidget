package com.song.mywidget.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by song on 2017/10/25.
 */
public class MyLayer extends View{

    private static final int LAYER_FLAGS =
            Canvas.MATRIX_SAVE_FLAG |
                    Canvas.CLIP_SAVE_FLAG |
                    Canvas.HAS_ALPHA_LAYER_SAVE_FLAG |
                    Canvas.FULL_COLOR_LAYER_SAVE_FLAG |
                    Canvas.CLIP_TO_LAYER_SAVE_FLAG;


    public MyLayer(Context context) {
        super(context);
    }
    public MyLayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawCircle(150, 150, 100, paint);


        canvas.saveLayerAlpha(0,0,400,400,125,LAYER_FLAGS);
        paint.setColor(Color.RED);
        canvas.drawCircle(200, 200, 100,paint);

        canvas.save();

    }
}
