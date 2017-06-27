package indi.aljet.dagger2test;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import indi.aljet.dagger2test.data.AppServiceModule;
import indi.aljet.dagger2test.data.api.ApiService;
import indi.aljet.dagger2test.data.api.ApiServiceModule;
import indi.aljet.dagger2test.model.User;

/**
 * Created by LJL-lenovo on 2017/6/27.
 */

@Singleton
@Component(modules = {AppModule.class,
ApiServiceModule.class,AppServiceModule.class})
public interface AppComponent {

    Application getApplication();

    ApiService getService();

    User getUser();
}
