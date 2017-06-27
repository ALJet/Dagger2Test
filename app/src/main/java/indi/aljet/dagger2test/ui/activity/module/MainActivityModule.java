package indi.aljet.dagger2test.ui.activity.module;

import dagger.Module;
import dagger.Provides;
import indi.aljet.dagger2test.model.User;
import indi.aljet.dagger2test.ui.activity.ActivityScope;
import indi.aljet.dagger2test.ui.activity.MainActivity;
import indi.aljet.dagger2test.ui.activity.presenter.MainActivityPresenter;

/**
 * Created by LJL-lenovo on 2017/6/27.
 */

@Module
public class MainActivityModule {

    private MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    @ActivityScope
    MainActivity provideMainActivity(){
        return mainActivity;
    }

    @Provides
    @ActivityScope
    MainActivityPresenter provideMainActivityPresenter
            (MainActivity mainActivity,
             User user){
        return new MainActivityPresenter(mainActivity
        ,user);
    }

}
