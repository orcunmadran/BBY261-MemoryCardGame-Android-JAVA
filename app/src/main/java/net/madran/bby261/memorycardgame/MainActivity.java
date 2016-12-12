package net.madran.bby261.memorycardgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonReDeal;

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
    private int[] imageListGame;
    private int randomNumber;
    private int rotationValue;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageListGame = new int[12];

        buttonReDeal = (Button) findViewById(R.id.reDeal);

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

        buttonReDeal.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                cardImage1.setImageResource(R.drawable.image_main);
                cardImage2.setImageResource(R.drawable.image_main);
                cardImage3.setImageResource(R.drawable.image_main);
                cardImage4.setImageResource(R.drawable.image_main);
                cardImage5.setImageResource(R.drawable.image_main);
                cardImage6.setImageResource(R.drawable.image_main);
                cardImage7.setImageResource(R.drawable.image_main);
                cardImage8.setImageResource(R.drawable.image_main);
                cardImage9.setImageResource(R.drawable.image_main);
                cardImage10.setImageResource(R.drawable.image_main);
                cardImage11.setImageResource(R.drawable.image_main);
                cardImage12.setImageResource(R.drawable.image_main);

                Random rotation = new Random();

                rotationValue = rotation.nextInt(8)-5;
                cardImage1.setRotation(rotationValue);

                rotationValue = rotation.nextInt(10)-5;
                cardImage2.setRotation(rotationValue);

                rotationValue = rotation.nextInt(11)-6;
                cardImage3.setRotation(rotationValue);

                rotationValue = rotation.nextInt(9)-5;
                cardImage4.setRotation(rotationValue);

                rotationValue = rotation.nextInt(11)-5;
                cardImage5.setRotation(rotationValue);

                rotationValue = rotation.nextInt(10)-5;
                cardImage6.setRotation(rotationValue);

                rotationValue = rotation.nextInt(8)-3;
                cardImage7.setRotation(rotationValue);

                rotationValue = rotation.nextInt(10)-5;
                cardImage8.setRotation(rotationValue);

                rotationValue = rotation.nextInt(7)-2;
                cardImage9.setRotation(rotationValue);

                rotationValue = rotation.nextInt(10)-5;
                cardImage10.setRotation(rotationValue);

                rotationValue = rotation.nextInt(6)-1;
                cardImage11.setRotation(rotationValue);

                rotationValue = rotation.nextInt(10)-5;
                cardImage12.setRotation(rotationValue);

                cardStatus1 = 0;
                cardStatus2 = 0;
                cardStatus3 = 0;
                cardStatus4 = 0;
                cardStatus5 = 0;
                cardStatus6 = 0;
                cardStatus7 = 0;
                cardStatus8 = 0;
                cardStatus9 = 0;
                cardStatus10 = 0;
                cardStatus11 = 0;
                cardStatus12 = 0;

                imageListAll = new int[] {R.drawable.image1, R.drawable.image1, R.drawable.image2, R.drawable.image2, R.drawable.image3, R.drawable.image3, R.drawable.image4, R.drawable.image4, R.drawable.image5, R.drawable.image5, R.drawable.image6, R.drawable.image6};

                Random randomNumberS = new Random();

                for(int i=0; i<imageListAll.length; i++){
                    randomNumber = randomNumberS.nextInt(12);
                    if(imageListAll[randomNumber] != 0){
                        imageListGame[i] = imageListAll[randomNumber];
                        imageListAll[randomNumber] = 0;
                    } else {
                        i--;
                    }
                }
            }
                    //System.out.println(randomNumber);
        });

        cardImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cardStatus1 == 0){
                    cardImage1.setImageResource(imageListGame[0]);
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
                    cardImage2.setImageResource(imageListGame[1]);
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
                    cardImage3.setImageResource(imageListGame[2]);
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
                    cardImage4.setImageResource(imageListGame[3]);
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
                    cardImage5.setImageResource(imageListGame[4]);
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
                    cardImage6.setImageResource(imageListGame[5]);
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
                    cardImage7.setImageResource(imageListGame[6]);
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
                    cardImage8.setImageResource(imageListGame[7]);
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
                    cardImage9.setImageResource(imageListGame[8]);
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
                    cardImage10.setImageResource(imageListGame[9]);
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
                    cardImage11.setImageResource(imageListGame[10]);
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
                    cardImage12.setImageResource(imageListGame[11]);
                    cardStatus12 = 1;
                } else {
                    cardImage12.setImageResource(R.drawable.image_main);
                    cardStatus12 = 0;
                }
            }
        });
    }
}