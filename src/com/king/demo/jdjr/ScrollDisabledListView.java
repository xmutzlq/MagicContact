package com.king.demo.jdjr;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class ScrollDisabledListView extends ListView {
  
    public ScrollDisabledListView(Context context) {
        super(context);
    }
  
    public ScrollDisabledListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
  
    public ScrollDisabledListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    
    @Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int spec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
				MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, spec);
	}
}
