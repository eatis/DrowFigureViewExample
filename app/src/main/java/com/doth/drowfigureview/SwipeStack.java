package com.doth.drowfigureview;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.FrameLayout;

import java.text.AttributedCharacterIterator;
import java.util.Random;

public class SwipeStack extends ViewGroup {

    private SwipeStackListener mListener;

    public SwipeStack(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void initialize() {

    }


    // ============================================
    // ViewGroup
    @Override
    protected void onLayout(boolean change, int l, int t, int r, int b) {

    }


    /**
     * Register a callback to be invoked when the user has swiped the top view
     * left / right or when the stack gets empty.
     *
     * @param listener The callback that will run
     */
    public void setListener(@Nullable SwipeStackListener listener) {
        mListener = listener;
    }

    public interface SwipeStackListener {
        void onViewSwipedToLeft(int position);

        void onViewSwipedToRight(int position);

        void onStackEmpty(int position);
    }
}
