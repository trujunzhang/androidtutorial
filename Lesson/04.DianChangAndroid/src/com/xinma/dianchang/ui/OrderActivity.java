package com.xinma.dianchang.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.xinma.dianchang.R;
import com.xinma.dianchang.widget.ScrollLayout;

/**
 * Created with IntelliJ IDEA.
 * User: xuxy
 * Date: 13-8-29
 * Time: 下午2:42
 * To change this template use File | Settings | File Templates.
 */
public class OrderActivity extends Activity {
    private ScrollLayout mScrollLayout;
    private int mViewCount;
    private Button[] mButtons;
    private int mCurSel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.xc_order_activity);

        initPageScroll();
    }


    /**
     * 初始化水平滚动翻页
     */
    private void initPageScroll() {
        mScrollLayout = (ScrollLayout) findViewById(R.id.main_scrolllayout);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.main_linearlayout_header);

        mViewCount = mScrollLayout.getChildCount();
        mButtons = new Button[mViewCount];

        for (int i = 0; i < mViewCount; i++) {
            mButtons[i] = (Button) linearLayout.getChildAt(i);
            mButtons[i].setTag(i);
            //mButtons[i].setChecked(false);
            mButtons[i].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    int pos = (Integer) (v.getTag());

                    mScrollLayout.snapToScreen(pos);
                }
            });
        }

        // 设置第一显示屏
        mCurSel =2;

        mScrollLayout
                .SetOnViewChangeListener(new ScrollLayout.OnViewChangeListener() {
                    public void OnViewChange(int viewIndex) {
                        // 切换列表视图-如果列表数据为空：加载数据
                        setCurPoint(viewIndex);
                    }
                });
    }


    /**
     * 设置底部栏当前焦点
     *
     * @param index
     */
    private void setCurPoint(int index) {
        if (index < 0 || index > mViewCount - 1 || mCurSel == index)
            return;
        mCurSel = index;
    }

}
