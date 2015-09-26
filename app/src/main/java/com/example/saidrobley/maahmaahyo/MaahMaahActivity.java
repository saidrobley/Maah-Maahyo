package com.example.saidrobley.maahmaahyo;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MaahMaahActivity extends ActionBarActivity {

    private MaahMaahBook maahMaahBook = new MaahMaahBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maah_maah);


        // Declare our View variables and assign

        final TextView maahMaahLabel = (TextView)findViewById(R.id.labelTextview);
        final TextView maahMaahTextView = (TextView)findViewById(R.id.maahmaahtextView);
        Button showMaahMaahButton = (Button)findViewById(R.id.maahmaahbutton);
        final RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayou);

        String maah = maahMaahBook.getMaahMaah();
        //String maah = "warya maxa tidhi";
        maahMaahTextView.setText(maah);
        int color = mColorWheel.getColor();

        relativeLayout.setBackgroundColor(color);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maah = maahMaahBook.getMaahMaah();
                maahMaahTextView.setText(maah);
                int color = mColorWheel.getColor();

                relativeLayout.setBackgroundColor(color);

            }
        };
        showMaahMaahButton.setOnClickListener(listener);
    }








}
