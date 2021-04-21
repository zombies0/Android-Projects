package com.example.camz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.FrameLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

public class MainActivity extends AppCompatActivity {

    Camera camera;
    FrameLayout frame;
    ShowCam showCam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        frame = (FrameLayout)findViewById(R.id.frame);

        //Open the Camera
        camera = Camera.open();

        showCam = new ShowCam(this,camera);
        frame.addView(showCam);


    }

    Camera.PictureCallback mPictureCallback = new Camera.PictureCallback() {
        @Override
        public void onPictureTaken(byte[] data, Camera camera) {

            File picture_file = getOutputMediaFile();

            if(picture_file == null){
                return;
            }
            else{

                try {

                    FileOutputStream fos = new FileOutputStream(picture_file);
                    fos.write(data);
                    fos.close();
                    camera.startPreview();
                }catch (IOException e){

                    e.printStackTrace();
                }

            }

        }
    };



    private File getOutputMediaFile() {

        String state = Environment.getExternalStorageState();

        if(!state.equals(Environment.MEDIA_MOUNTED)){

            return  null;
        }
        else{

            File folder = new File(Environment.getExternalStorageDirectory() + File.separator + "GUI");

            if(!folder.exists()){
                folder.mkdirs();

            }

            File outPutFile = new File(folder,"temp.jpg");

            return  outPutFile;

        }

    }

    public void captureImage(View v){

        if(camera != null){

            camera.takePicture(null,null,mPictureCallback);

        }

    }


}