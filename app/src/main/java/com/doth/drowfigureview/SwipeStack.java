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


    public interface SwipeStackListener {
        void onViewSwipedToLeft(int position);

        void onViewSwipedToRight(int position);

        void onStackEmpty(int position);
    }
}
