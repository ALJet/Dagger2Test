package indi.aljet.dagger2test.data;

import java.io.UnsupportedEncodingException;

import dagger.Module;
import dagger.Provides;
import indi.aljet.dagger2test.model.User;

/**
 * Created by LJL-lenovo on 2017/6/27.
 */

@Module
public class AppServiceModule {
    @Provides
    User provideUser(){
        User user = new User();
        user.setId("1");
        user.setName("hello world");
        return user;
    }
}
