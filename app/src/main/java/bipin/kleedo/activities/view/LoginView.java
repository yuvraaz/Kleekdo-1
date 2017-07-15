package bipin.kleedo.activities.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;


import bipin.kleedo.R;
import delegates.LoginCallbackListener;

public class LoginView
        extends Fragment
        implements OnClickListener {
    private EditText confirmNumber;
    private ImageView loginBtn;
    private LoginCallbackListener loginCallbackListener;
    private EditText phoneNumber;

    private void initView(View paramView) {
        this.phoneNumber = ((EditText) paramView.findViewById(R.id.phone_number));
        this.confirmNumber = ((EditText) paramView.findViewById(R.id.confirm_phone));
        this.loginBtn = ((ImageView) paramView.findViewById(R.id.loginBtnView));
        this.loginBtn.setOnClickListener(this);
    }

    public void onClick(View paramView) {
        if (paramView == this.loginBtn) {
            this.loginCallbackListener.pinCodeView();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle) {
        return paramLayoutInflater.inflate(R.layout.login_view, paramViewGroup, false);
    }

    public void onViewCreated(View paramView, @Nullable Bundle paramBundle) {
        super.onViewCreated(paramView, paramBundle);
        this.loginCallbackListener = ((LoginCallbackListener) getActivity());
        initView(paramView);
    }
}
