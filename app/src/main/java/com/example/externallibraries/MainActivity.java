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

        ImageView picassoImage = findViewById(R.id.picassoImage); // Finds the ImageView
        Picasso.get()
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/" + // Tries to load the
                        "4/44/Windows_95_stacked_logo.svg/2560px" +                 // image three times
                        "-Windows_95_stacked_logo.svg.png")
                .placeholder(R.mipmap.ic_launcher) // Placeholder that shows before the image is loaded
                                                    // or has failed to load
                .error(R.drawable.error) // Shows if the original image couldn't load after 3 tries
                .into(picassoImage); // Sets the image into the ImageView
    }
}