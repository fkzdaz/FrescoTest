package com.example.fang.frescotest;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        initFresco();
    }

    private void initFresco() {
        Uri uri=Uri.parse("http://img.tupianzj.com/uploads/allimg/160320/9-160320134A8.jpg");
        SimpleDraweeView draweeView= (SimpleDraweeView) findViewById(R.id.my_image_view);
        draweeView.setImageURI(uri);
    }
}
