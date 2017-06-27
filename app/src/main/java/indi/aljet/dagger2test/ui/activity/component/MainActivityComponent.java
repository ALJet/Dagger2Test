package indi.aljet.dagger2test.ui.activity.component;

import dagger.Component;
import indi.aljet.dagger2test.AppComponent;
import indi.aljet.dagger2test.ui.activity.ActivityScope;
import indi.aljet.dagger2test.ui.activity.MainActivity;
import indi.aljet.dagger2test.ui.activity.module.MainActivityModule;
import indi.aljet.dagger2test.ui.activity.presenter.MainActivityPresenter;

/**
 * Created by LJL-lenovo on 2017/6/27.
 */

@ActivityScope
@Component(modules = MainActivityModule.class,
dependencies = AppComponent.class)
public interface MainActivityComponent {

    MainActivity inject(MainActivity mainActivity);
    MainActivityPresenter presenter();
}
