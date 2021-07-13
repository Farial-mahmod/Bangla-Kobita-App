package com.khalnayak.banglakobita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;


public class MainActivity2 extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pdfView = findViewById(R.id.pdfView);


        int story_position = getIntent().getIntExtra("key_position", 0);
        if(story_position==0){
            pdfView.fromAsset("Aboltabol.pdf").load();
        }
        else if(story_position==1){
            pdfView.fromAsset("Bhor.pdf").load();
        }
        else if(story_position==2){
            pdfView.fromAsset("HonHon.pdf").load();
        }
        else if(story_position==3){
            pdfView.fromAsset("mamarbari.pdf").load();
        }
        else if(story_position==4){
            pdfView.fromAsset("MorGhum.pdf").load();
        }
        else if(story_position==5){
            pdfView.fromAsset("Nemontonno.pdf").load();

        }
        else if(story_position==6){
            pdfView.fromAsset("Palkirgaan.pdf").load();
        }
        else if(story_position==7){
            pdfView.fromAsset("Protidan.pdf").load();
        }
        else if(story_position==8){
            pdfView.fromAsset("Shobarami.pdf").load();
        }
        else if(story_position==9){
            pdfView.fromAsset("ShuknoPatar.pdf").load();
        }
        else if(story_position==10){
            pdfView.fromAsset("amader.pdf").load();
        }







    }
}
