package com.dqs.shangri.diyview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Shangri on 2016/10/31.
 */

public class MyFirstView extends View {
    private static String TAG = "MyFirstView";
    public MyFirstView(Context context) {
        super(context);
    }

    public MyFirstView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 计算尺寸
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMySize(100, widthMeasureSpec);
        Log.d(TAG, "onMeasure: width = " + width);
        int height = getMySize(100, heightMeasureSpec);
        Log.d(TAG, "onMeasure: width = " + height);

        setMeasuredDimension(width, height);
    }

    private int getMySize(int defaultSize, int measureSpec) {
        int mySize = defaultSize;

        int mode = MeasureSpec.getMode(measureSpec);
        int size = MeasureSpec.getSize(measureSpec);

        Log.d(TAG, "getMySize: size = " + size);

        switch (mode) {
            case MeasureSpec.UNSPECIFIED: {//如果没有指定大小，就设置为默认大小
                Log.d(TAG, "getMySize: mode = UNSPECIFIED");
                mySize = defaultSize;
                break;
            }
            case MeasureSpec.AT_MOST: {//如果测量模式是最大取值为size
                //我们将大小取最大值,你也可以取其他值
                Log.d(TAG, "getMySize: mode = AT_MOST");
                mySize = defaultSize;
                break;
            }
            case MeasureSpec.EXACTLY: {//如果是固定的大小，那就不要去改变它
                Log.d(TAG, "getMySize: mode = EXACTLY");
                mySize = size;
                break;
            }
        }
        return mySize;
    }

}
