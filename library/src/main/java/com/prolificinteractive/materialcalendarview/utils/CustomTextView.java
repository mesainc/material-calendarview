package com.prolificinteractive.materialcalendarview.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.prolificinteractive.materialcalendarview.R;

public class CustomTextView extends TextView {

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        applyCustomFont(context, attrs);
    }

    private void applyCustomFont(Context context, AttributeSet attrs) {
        TypedArray attributeArray = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView);
        String fontName = attributeArray.getString(R.styleable.CustomTextView_font);

        if (fontName != null) {
            Typeface face = Typeface.createFromAsset(context.getAssets(), fontName);

            if (face != null) {
                this.setTypeface(face);
            }
        }
    }

}
