package net.madran.bby261.memorycardgame;

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
    private int clickCount = 0;
    private int firstImage;
    private int secondImage;

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
                switch (clickCount){
                    case 0:
                        clickCount++;
                        firstImage = 0;
                        cardImage1.setImageResource(imageListAll[0]);
                        break;
                    case 1:
                        clickCount++;
                        secondImage = 0;
                        cardImage1.setImageResource(imageListAll[0]);
                        break;
                    case 2:
                        clickCount=0;
                        if(firstImage == secondImage){
                            cardImage1.setImageResource(imageListAll[0]);
                        } else{
                            cardImage1.setImageResource(R.drawable.image_main);
                        }
                }
            }
        });

        cardImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (clickCount){
                    case 0:
                        clickCount++;
                        firstImage = 1;
                        cardImage2.setImageResource(imageListAll[1]);
                        break;
                    case 1:
                        clickCount++;
                        secondImage = 1;
                        cardImage2.setImageResource(imageListAll[1]);
                        break;
                    case 2:
                        clickCount=0;
                        if(firstImage == secondImage){
                            cardImage2.setImageResource(imageListAll[1]);
                        } else{
                            cardImage2.setImageResource(R.drawable.image_main);
                        }
                }
            }
        });

        cardImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage3.setImageResource(imageListAll[3]);
            }
        });

        cardImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage4.setImageResource(imageListAll[2]);
            }
        });

        cardImage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage5.setImageResource(imageListAll[0]);
            }
        });

        cardImage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage6.setImageResource(imageListAll[5]);
            }
        });

        cardImage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage7.setImageResource(imageListAll[2]);
            }
        });

        cardImage8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage8.setImageResource(imageListAll[4]);
            }
        });

        cardImage9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage9.setImageResource(imageListAll[5]);
            }
        });

        cardImage10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage10.setImageResource(imageListAll[4]);
            }
        });

        cardImage11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage11.setImageResource(imageListAll[3]);
            }
        });

        cardImage12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage12.setImageResource(imageListAll[1]);
            }
        });
    }
}
