package com.uca.apps.isi.nct;
import com.facebook.drawee.backends.pipeline.Fresco;
import android.app.Application;

/**
 * Created by Administrador on 09/10/2017.
 */

public class ProjectApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }

}