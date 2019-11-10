package com.example.harikedua;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URL;

public class MultimediaActivity extends AppCompatActivity {

    VideoView videoObjek;
    MediaController mediaControllerVideo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);
        videoObjek=(VideoView) findViewById(R.id.video_view);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        videoObjek.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.));
        mediaControllerVideo= new MediaController(this);
        mediaControllerVideo.setAnchorView(videoObjek);
        videoObjek.start();
    }
}
