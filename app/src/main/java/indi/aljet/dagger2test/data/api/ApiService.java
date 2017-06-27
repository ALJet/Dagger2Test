package indi.aljet.dagger2test.data.api;

import android.graphics.drawable.Drawable;

import java.util.List;

import indi.aljet.dagger2test.model.User;
import retrofit.Callback;
import retrofit.http.GET;


/**
 * Created by LJL-lenovo on 2017/6/27.
 */

public interface ApiService {

    @GET("/users")
    public void getUsers(Callback<List<User>> callback);
}
