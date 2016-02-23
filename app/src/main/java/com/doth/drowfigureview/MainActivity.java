package com.doth.drowfigureview;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.content.Intent;
import android.net.Uri;
//import android.support.design.widget.FloatingActionButton;
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



public class MainActivity extends AppCompatActivity implements SwipeStack.SwipeStackListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setContentView(new MyView(this));
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