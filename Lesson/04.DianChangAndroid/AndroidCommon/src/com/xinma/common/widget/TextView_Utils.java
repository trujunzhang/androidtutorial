package com.xinma.common.widget;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;

/**
 * Created by djzhang on 6/8/13.
 */
public class TextView_Utils {
    /**
     * template
     */
    //new TextView_Utils((TextView) findViewById(R.id.)).setText().setVisibility().setTypeface(GlobalFontFaceUtils.getCustomFont(this));

    private TextView textView;

    public TextView_Utils(View view, int viewId) {
        this.textView = (TextView) view.findViewById(viewId);
    }

    //public TextView_Utils(TextView textView) {
    //this.textView = textView;
    //}

    public TextView_Utils setText(String text) {
        this.textView.setText(text);
        return this;
    }

    public TextView_Utils setTextSize(Float textSize) {
        this.textView.setTextSize(textSize);
        return this;
    }

    public TextView_Utils setVisibility(int visibility) {
        this.textView.setVisibility(visibility);
        return this;
    }

    public TextView_Utils setVisibility(String text) {
        int visibility = View.VISIBLE;
        if (text == null || text.equals("") || text.equalsIgnoreCase("null")) {
            visibility = View.GONE;
        }
        return setVisibility(visibility);
    }

    public TextView_Utils setTypeface(Typeface typeface) {
        this.textView.setTypeface(typeface);
        return this;
    }


    public TextView_Utils setOnClickListener(View.OnClickListener listener) {
        this.textView.setOnClickListener(listener);
        return this;
    }

}
