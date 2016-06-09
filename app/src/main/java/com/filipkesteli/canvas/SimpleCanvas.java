package com.filipkesteli.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by programer on 9.6.2016..
 */
public class SimpleCanvas extends View {

    public SimpleCanvas(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.LTGRAY);

        Paint paint = new Paint();
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(6);
        canvas.drawLine(100, 20, 100, 300, paint);
        canvas.drawCircle(300, 150, 100, paint);

        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(10);
        for (int y = 45, alpha = 255; alpha > 2; y += 45, alpha >>= 2) {
            paint.setAlpha(alpha);
            canvas.drawLine(40, y, 450, 450 - y, paint);
        }
    }
}
