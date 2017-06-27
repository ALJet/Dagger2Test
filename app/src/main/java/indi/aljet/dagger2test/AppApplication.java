package indi.aljet.dagger2test;

import android.app.Application;
import android.content.Context;

import indi.aljet.dagger2test.data.AppServiceModule;
import indi.aljet.dagger2test.data.api.ApiServiceModule;

/**
 * Created by LJL-lenovo on 2017/6/27.
 */

public class AppApplication extends Application {

    private AppComponent appComponent;

    public static AppApplication get(Context context){
        return (AppApplication)context
                .getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .apiServiceModule(new
                        ApiServiceModule())
                .appServiceModule(new
                        AppServiceModule())
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
