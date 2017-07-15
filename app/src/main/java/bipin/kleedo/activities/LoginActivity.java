package bipin.kleedo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;


import bipin.kleedo.R;
import bipin.kleedo.activities.view.FingerPrintView;
import bipin.kleedo.activities.view.LoginView;
import bipin.kleedo.activities.view.PasswordView;
import delegates.LoginCallbackListener;

public class LoginActivity
        extends AbstractBaseActivity
        implements OnClickListener, LoginCallbackListener {
    private LinearLayout ifUanAccount;
    private LinearLayout registerHere;

    private void initUIView() {
        this.registerHere = ((LinearLayout) findViewById(R.id.registerHere));
        this.ifUanAccount = ((LinearLayout) findViewById(R.id.ifUanAccount));
        this.registerHere.setOnClickListener(this);
        this.ifUanAccount.setOnClickListener(this);
    }

    private void loginView() {
        setFragmentView(R.id.homeView, new LoginView(), false);
    }

    public void fingerPrintView() {
        setFragmentView(R.id.homeView, new FingerPrintView(), true);
    }

    protected int getLayoutView() {
        return R.layout.login_base;
    }

    public void homeTabView() {
//        startActivity(new Intent(this, HomeBaseActivity.class));
    }

    public void onClick(View paramView) {
        if (paramView == this.registerHere) {
            startActivity(new Intent(this, RegistrationActivity.class));
        }
        while (paramView != this.ifUanAccount) {
            return;
        }
    }

    public void onCreate(@Nullable Bundle paramBundle) {
        super.onCreate(paramBundle);
        initUIView();
        loginView();
    }

    public void pinCodeView() {
        setFragmentView(R.id.homeView, new PasswordView(), true);
    }
}

