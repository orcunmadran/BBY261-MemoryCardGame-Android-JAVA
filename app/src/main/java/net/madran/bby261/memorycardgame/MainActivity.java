package net.madran.bby261.memorycardgame;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView cardImage1;
    private ImageView cardImage2;
    private ImageView cardImage3;
    private ImageView cardImage4;
    private ImageView cardImage5;
    private ImageView cardImage6;
    private ImageView cardImage7;
    private ImageView cardImage8;
    private ImageView cardImage9;
    private ImageView cardImage10;
    private ImageView cardImage11;
    private ImageView cardImage12;

    private int[] imageListAll;

    private int cardStatus1 = 0;
    private int cardStatus2 = 0;
    private int cardStatus3 = 0;
    private int cardStatus4 = 0;
    private int cardStatus5 = 0;
    private int cardStatus6 = 0;
    private int cardStatus7 = 0;
    private int cardStatus8 = 0;
    private int cardStatus9 = 0;
    private int cardStatus10 = 0;
    private int cardStatus11 = 0;
    private int cardStatus12 = 0;

    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageListAll = new int[] {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6};

        cardImage1 = (ImageView) findViewById(R.id.imageView1);
        cardImage2 = (ImageView) findViewById(R.id.imageView2);
        cardImage3 = (ImageView) findViewById(R.id.imageView3);
        cardImage4 = (ImageView) findViewById(R.id.imageView4);
        cardImage5 = (ImageView) findViewById(R.id.imageView5);
        cardImage6 = (ImageView) findViewById(R.id.imageView6);
        cardImage7 = (ImageView) findViewById(R.id.imageView7);
        cardImage8 = (ImageView) findViewById(R.id.imageView8);
        cardImage9 = (ImageView) findViewById(R.id.imageView9);
        cardImage10 = (ImageView) findViewById(R.id.imageView10);
        cardImage11 = (ImageView) findViewById(R.id.imageView11);
        cardImage12 = (ImageView) findViewById(R.id.imageView12);

        cardImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus1 == 0){
                    cardImage1.setImageResource(imageListAll[0]);
                    cardStatus1 = 1;
                } else {
                    cardImage1.setImageResource(R.drawable.image_main);
                    cardStatus1 = 0;
                }
            }
        });

        cardImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus2 == 0){
                    cardImage2.setImageResource(imageListAll[1]);
                    cardStatus2 = 1;
                } else {
                    cardImage2.setImageResource(R.drawable.image_main);
                    cardStatus2 = 0;
                }
            }
        });

        cardImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus3 == 0){
                    cardImage3.setImageResource(imageListAll[3]);
                    cardStatus3 = 1;
                } else {
                    cardImage3.setImageResource(R.drawable.image_main);
                    cardStatus3 = 0;
                }
            }
        });

        cardImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus4 == 0){
                    cardImage4.setImageResource(imageListAll[2]);
                    cardStatus4 = 1;
                } else {
                    cardImage4.setImageResource(R.drawable.image_main);
                    cardStatus4 = 0;
                }
            }
        });

        cardImage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus5 == 0){
                    cardImage5.setImageResource(imageListAll[0]);
                    cardStatus5 = 1;
                } else {
                    cardImage5.setImageResource(R.drawable.image_main);
                    cardStatus5 = 0;
                }
            }
        });

        cardImage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus6 == 0){
                    cardImage6.setImageResource(imageListAll[5]);
                    cardStatus6 = 1;
                } else {
                    cardImage6.setImageResource(R.drawable.image_main);
                    cardStatus6 = 0;
                }
            }
        });

        cardImage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus7 == 0){
                    cardImage7.setImageResource(imageListAll[2]);
                    cardStatus7 = 1;
                } else {
                    cardImage7.setImageResource(R.drawable.image_main);
                    cardStatus7 = 0;
                }
            }
        });

        cardImage8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus8 == 0){
                    cardImage8.setImageResource(imageListAll[4]);
                    cardStatus8 = 1;
                } else {
                    cardImage8.setImageResource(R.drawable.image_main);
                    cardStatus8 = 0;
                }
            }
        });

        cardImage9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus9 == 0){
                    cardImage9.setImageResource(imageListAll[5]);
                    cardStatus9 = 1;
                } else {
                    cardImage9.setImageResource(R.drawable.image_main);
                    cardStatus9 = 0;
                }
            }
        });

        cardImage10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus10 == 0){
                    cardImage10.setImageResource(imageListAll[4]);
                    cardStatus10 = 1;
                } else {
                    cardImage10.setImageResource(R.drawable.image_main);
                    cardStatus10 = 0;
                }
            }
        });

        cardImage11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus11 == 0){
                    cardImage11.setImageResource(imageListAll[3]);
                    cardStatus11 = 1;
                } else {
                    cardImage11.setImageResource(R.drawable.image_main);
                    cardStatus11 = 0;
                }
            }
        });

        cardImage12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus12 == 0){
                    cardImage12.setImageResource(imageListAll[1]);
                    cardStatus12 = 1;
                } else {
                    cardImage12.setImageResource(R.drawable.image_main);
                    cardStatus12 = 0;
                }
            }
        });
    }
}