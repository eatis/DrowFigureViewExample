package com.doth.drowfigureview;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//import com.doth.SwipeStack;
import com.doth.drowfigureview.SwipeStack;

public class MainActivity extends AppCompatActivity implements SwipeStack.SwipeStackListener, View.OnClickListener {

    private Button mButtonLeft, mButtonRight;
    private FloatingActionButton mFab;

    private SwipeStack mSwipeStack;
    private ArrayList<String> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSwipeStack = (SwipeStack)findViewById(R.id.swipeStack);
        mButtonLeft = (Button)findViewById(R.id.buttonSwipeLeft);
        mButtonRight = (Button)findViewById(R.id.buttonSwipeRight);
        mFab = (FloatingActionButton)findViewById(R.id.fabAdd);

        mButtonLeft.setOnClickListener(this);
        mButtonRight.setOnClickListener(this);
        mFab.setOnClickListener(this);

        mData = new ArrayList<>();
        mSwipeStack.setListener(this);
        mSwipeStack.setListener(this);

        //setContentView(new MyView(this));

        fillWithTestData();
    }

    private void fillWithTestData() {
        for (int x=0; x < 5; x++) {
            mData.add(getString(R.string.dummy_text) + " " + (x + 1));
        }
    }


    @Override
    public void onClick(View v) {

    }
    // =================================================
    // SwipeStack
    @Override
    public void onViewSwipedToLeft(int postition) {

    }

    @Override
    public void onViewSwipedToRight(int postition) {

    }

    @Override
    public void onStackEmpty(int postition) {

    }
}