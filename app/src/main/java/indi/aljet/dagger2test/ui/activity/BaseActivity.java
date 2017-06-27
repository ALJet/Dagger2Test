package indi.aljet.dagger2test.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import indi.aljet.dagger2test.AppApplication;
import indi.aljet.dagger2test.AppComponent;

/**
 * Created by LJL-lenovo on 2017/6/27.
 */

public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent(
                AppApplication
                .get(this)
                .getAppComponent());
    }

    protected abstract void setupActivityComponent(AppComponent appComponent);

}
