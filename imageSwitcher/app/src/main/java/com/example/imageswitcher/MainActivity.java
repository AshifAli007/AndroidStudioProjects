package com.example.imageswitcher;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button prevBtn, nxtBtn, selectImg;
    public ImageView currentImg;
    int currentPosition = 0;
    ArrayList<Uri> imagesArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prevBtn = (Button) findViewById(R.id.prev);
        nxtBtn  = (Button) findViewById(R.id.next);
        selectImg = (Button) findViewById(R.id.select);
        currentImg = (ImageView) findViewById(R.id.img);
        imagesArray = new ArrayList<Uri>();

        selectImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
                startActivityForResult(intent, 1);
            }
        });

        nxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPosition < imagesArray.size() - 1) {
                    currentPosition++;
                    currentImg.setImageURI(imagesArray.get(currentPosition));
                } else {
                    Toast.makeText(MainActivity.this, "This is last image", Toast.LENGTH_SHORT).show();
                }
            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPosition > 0) {
                    currentPosition--;
                    currentImg.setImageURI(imagesArray.get(currentPosition));
                }

            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK && null != data) {

            Log.i("data",String.valueOf(data));

            if (data.getClipData() != null) {
                ClipData mClipData = data.getClipData();
                int imagesCount = data.getClipData().getItemCount();
                for (int i = 0; i < imagesCount; i++) {
                    Uri imageUrl = data.getClipData().getItemAt(i).getUri();
                    imagesArray.add(imageUrl);
                }
                currentImg.setImageURI(imagesArray.get(0));
                currentPosition = 0;
            } else {
                Uri imageUrl = data.getData();
                imagesArray.add(imageUrl);
                currentImg.setImageURI(imagesArray.get(0));
                currentPosition = 0;
            }
        }
    }
}