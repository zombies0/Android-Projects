package com.example.camz;

import android.content.Context;
import android.content.res.Configuration;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

import java.io.IOException;
import java.util.List;

public class ShowCam extends SurfaceView implements SurfaceHolder.Callback {

    Camera camera;
    SurfaceHolder holder;

    public ShowCam(Context context, Camera camera) {
        super(context);
        this.camera = camera;
        holder = getHolder();
        holder.addCallback(this);
    }


    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {

        Camera.Parameters params = camera.getParameters();

        //Change camera resolution

        List<Camera.Size> sizes = params.getSupportedPictureSizes();
        Camera.Size mSize = null;

        for(Camera.Size size : sizes){
            mSize = size;
        }


        // Change the orientation of the camera

        if(this.getResources().getConfiguration().orientation != Configuration.ORIENTATION_LANDSCAPE){
            params.set("orientation","portrait");
            camera.setDisplayOrientation(90);
            params.setRotation(90);
        }
        else{

            params.set("Orientation","landscape");
            camera.setDisplayOrientation(0);
            params.setRotation(0);

        }

        assert mSize != null;
        params.setPictureSize(mSize.width,mSize.height);
        camera.setParameters(params);
        try{

            camera.setPreviewDisplay(holder);
            camera.startPreview();

        }catch (IOException e){
            e.printStackTrace();
        }


    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {



    }
}
