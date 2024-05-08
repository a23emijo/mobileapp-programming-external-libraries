package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.os.Bundle;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picassoImage = findViewById(R.id.picassoImage);
        Picasso.get()
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Windows_95_stacked_logo.svg/2560px-Windows_95_stacked_logo.svg.png")
                .placeholder(R.mipmap.ic_launcher)
                .error(R.drawable.error)
                .into(picassoImage);
    }
}
