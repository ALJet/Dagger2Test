package indi.aljet.dagger2test.data.api;

import android.app.Application;

import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;
import retrofit.client.OkClient;


/**
 * Created by LJL-lenovo on 2017/6/27.
 */

@Module
public class ApiServiceModule {

    private static final String ENDPOIINT = "";

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(){
        OkHttpClient okHttpClient = new
                OkHttpClient();
        okHttpClient.setConnectTimeout(60 * 1000,
                TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(60 *
        1000,TimeUnit.MILLISECONDS);
        return okHttpClient;

    }

    @Provides
    @Singleton
    RestAdapter provideRestAdater(
            Application application,
            OkHttpClient okHttpClient){
        RestAdapter.Builder builder =
                new RestAdapter.Builder();
        builder.setClient(new OkClient(okHttpClient))
                .setEndpoint(ENDPOIINT);
        return builder.build();
    }

    @Provides
    @Singleton
    ApiService provideapiService(RestAdapter
                                 restAdapter){
        return restAdapter.create(ApiService
        .class);
    }

}
