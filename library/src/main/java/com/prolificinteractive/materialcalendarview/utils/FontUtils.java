package com.prolificinteractive.materialcalendarview.utils;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.widget.CheckedTextView;
import android.widget.TextView;

import com.prolificinteractive.materialcalendarview.R;

public class FontUtils {

    public static Typeface sTFFuturaStdBook;
    public static Typeface sTFFuturaStdHeavy;
    public static Typeface sTFFuturaStdLight;
    public static Typeface sTFFuturaStdMedium;
    public static Typeface sTFFuturaStdBold;


    public static void initFontUtils(AssetManager assets, Resources resources) {
        sTFFuturaStdBook = Typeface.createFromAsset(assets, resources.getString(R.string.font_futura_std_book));
        sTFFuturaStdHeavy = Typeface.createFromAsset(assets, resources.getString(R.string.font_futura_std_heavy));
        sTFFuturaStdLight = Typeface.createFromAsset(assets, resources.getString(R.string.font_futura_std_light));
        sTFFuturaStdMedium = Typeface.createFromAsset(assets, resources.getString(R.string.font_futura_std_medium));
        sTFFuturaStdBold = Typeface.createFromAsset(assets, resources.getString(R.string.font_futura_std_bold));
    }

    public static void setTypeFace(int fontName, CheckedTextView textView){
        if (fontName == R.string.font_futura_std_book) {
            textView.setTypeface(sTFFuturaStdBook);

        } else if (fontName == R.string.font_futura_std_heavy) {
            textView.setTypeface(sTFFuturaStdHeavy);

        } else if (fontName == R.string.font_futura_std_light) {
            textView.setTypeface(sTFFuturaStdLight);

        } else if (fontName == R.string.font_futura_std_medium) {
            textView.setTypeface(sTFFuturaStdMedium);

        } else if (fontName == R.string.font_futura_std_bold) {
            textView.setTypeface(sTFFuturaStdBold);

        } else {
            textView.setTypeface(sTFFuturaStdMedium);
        }
    }

    public static void setTypeFace(int fontName, TextView textView){
        if (fontName == R.string.font_futura_std_book) {
            textView.setTypeface(sTFFuturaStdBook);

        } else if (fontName == R.string.font_futura_std_heavy) {
            textView.setTypeface(sTFFuturaStdHeavy);

        } else if (fontName == R.string.font_futura_std_light) {
            textView.setTypeface(sTFFuturaStdLight);

        } else if (fontName == R.string.font_futura_std_medium) {
            textView.setTypeface(sTFFuturaStdMedium);

        } else if (fontName == R.string.font_futura_std_bold) {
            textView.setTypeface(sTFFuturaStdBold);

        } else {
            textView.setTypeface(sTFFuturaStdMedium);
        }
    }

}
