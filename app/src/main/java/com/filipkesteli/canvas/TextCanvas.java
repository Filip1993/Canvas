package com.filipkesteli.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by programer on 9.6.2016..
 */
public class TextCanvas extends View {

    private static final String TEXT = "Android";

    public TextCanvas(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setTextSize(100);
        canvas.drawText(TEXT, 100, 100, paint);

        paint.setColor(Color.CYAN);
        Path path = new Path();
        path.addArc(new RectF(0, 200, 550, 600), 225, 90);
        canvas.drawTextOnPath(TEXT, path, 0, 0, paint);

        paint.setColor(Color.GREEN);
        float[] points = new float[] {
                100, 350,
                170, 390,
                220, 350,
                280, 390,
                320, 350,
                375, 390,
                400, 350
        };
        canvas.drawPosText(TEXT, points, paint);
    }
}
