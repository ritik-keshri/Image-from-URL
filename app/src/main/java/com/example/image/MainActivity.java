package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.image);
        ImageView imageView2 = findViewById(R.id.image2);

        String imagrFromApi = "https://books.google.com/books/content?id=F1wgqlNi8AMC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api";
        Picasso.get().load(imagrFromApi).into(imageView2);
        String s = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/1200px-Image_created_with_a_mobile_phone.png";
        Picasso.get().load(s).into(imageView);
    }
}