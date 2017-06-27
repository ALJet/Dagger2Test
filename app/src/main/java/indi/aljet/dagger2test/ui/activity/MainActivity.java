package indi.aljet.dagger2test.ui.activity;


import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import indi.aljet.dagger2test.AppComponent;
import indi.aljet.dagger2test.R;
import indi.aljet.dagger2test.ui.activity.component.DaggerMainActivityComponent;
import indi.aljet.dagger2test.ui.activity.module.MainActivityModule;
import indi.aljet.dagger2test.ui.activity.presenter.MainActivityPresenter;

public class MainActivity extends BaseActivity {
    @BindView(R.id.tv)
    TextView textView;

    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter.showUserName();
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainActivityComponent
                .builder()
                .appComponent(appComponent)
                .mainActivityModule(new MainActivityModule(this))
                .build()
                .inject(this);

    }

    public void setTextView(String username){
        textView.setText(username);
    }

}
