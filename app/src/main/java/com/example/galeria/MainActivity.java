package com.example.galeria;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {



    private ImageView img00;
    private ImageView img01;
    private ImageView img02;
    private ImageView img10;
    private ImageView img11;
    private ImageView img12;
    private ImageView img20;
    private ImageView img21;
    private ImageView img22;

    private ImageView aux;

    private int[] idList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img00 = findViewById(R.id.img00);
        img01 = findViewById(R.id.img01);
        img02 = findViewById(R.id.img02);
        img10 = findViewById(R.id.img10);
        img11 = findViewById(R.id.img11);
        img12 = findViewById(R.id.img12);
        img20 = findViewById(R.id.img20);
        img21 = findViewById(R.id.img21);
        img22 = findViewById(R.id.img22);

        idList[0]=img00.getId();
        idList[1]=img01.getId();
        idList[2]=img02.getId();
        idList[3]=img10.getId();
        idList[4]=img11.getId();
        idList[5]=img12.getId();
        idList[6]=img20.getId();
        idList[7]=img21.getId();
        idList[8]=img22.getId();

        img00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                aux.setId(getIdRand(idList));


                img00.setImageDrawable(aux.getDrawable());

            }
        });

    }

    public static int getIdRand(int[] array) {
        int rand = new Random().nextInt(array.length);
        return array[rand];
    }




}
