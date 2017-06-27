package indi.aljet.dagger2test.ui.activity.presenter;

import indi.aljet.dagger2test.model.User;
import indi.aljet.dagger2test.ui.activity.MainActivity;

/**
 * Created by LJL-lenovo on 2017/6/27.
 */

public class MainActivityPresenter {

    private MainActivity mainActivity;
    private User user;

    public MainActivityPresenter(MainActivity mainActivity, User user) {
        this.mainActivity = mainActivity;
        this.user = user;
    }

    public void showUserName(){
        mainActivity.setTextView(user.getName());
    }
}
