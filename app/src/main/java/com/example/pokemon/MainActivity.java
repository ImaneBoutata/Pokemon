package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView cardView1;
    CardView cardView2;
    CardView cardView3;
    CardView cardView4;
    CardView cardView5;
    CardView cardView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardView1 = findViewById(R.id.card1);
        cardView2 = findViewById(R.id.card2);
        cardView3 = findViewById(R.id.card3);
        cardView4 = findViewById(R.id.card4);
        cardView5 = findViewById(R.id.card5);
        cardView6 = findViewById(R.id.card6);

        clickListner();

    }

    public void clickListner(){

        CardView cardView1 = findViewById(R.id.card1);
        CardView cardView2 = findViewById(R.id.card2);
        CardView cardView3 = findViewById(R.id.card3);
        CardView cardView4 = findViewById(R.id.card4);
        CardView cardView5 = findViewById(R.id.card5);
        CardView cardView6 = findViewById(R.id.card6);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard1();
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openCard2();}
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard3();
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard4();
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard5();
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard6();
            }
        });
    }

    public void openCard1(){
        Intent intent = new Intent(getApplicationContext(), fairyCard.class);
        startActivity(intent);
    }

    public void openCard2(){
        Intent intent = new Intent(getApplicationContext(), fireCardd.class);
        startActivity(intent);
    }
    public void openCard3(){
        Intent intent = new Intent(getApplicationContext(), ghzalaCard.class);
        startActivity(intent);
    }
    public void openCard4(){
        Intent intent = new Intent(getApplicationContext(), grassCard.class);
        startActivity(intent);
    }
    public void openCard5(){
        Intent intent = new Intent(getApplicationContext(), ninetailsCard.class);
        startActivity(intent);
    }
    public void openCard6(){
        Intent intent = new Intent(getApplicationContext(), pikatchuCard.class);
        startActivity(intent);
    }
}