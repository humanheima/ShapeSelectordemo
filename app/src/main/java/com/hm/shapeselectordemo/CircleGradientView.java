package com.hm.shapeselectordemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by p_dmweidu on 2024/1/25
 * Desc: 测试绘制一个环形圆弧
 */
public class CircleGradientView extends View {

    public CircleGradientView(Context context) {
        this(context, null);
    }

    public CircleGradientView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private Paint paint;

    private void init() {
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE); // 设置画笔样式为描边
        paint.setStrokeWidth(10); // 设置描边宽度
        paint.setAntiAlias(true);
        Shader shader = new LinearGradient(0, 0, 100, 100, Color.RED, Color.BLUE, Shader.TileMode.CLAMP);
        paint.setShader(shader); // 设置渐变色
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(60, 60, 50, paint); // 绘制圆
    }

}
