package bipin.kleedo.activities.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;


import bipin.kleedo.R;
import delegates.LoginCallbackListener;

public class FingerPrintView
        extends Fragment
        implements OnClickListener {
    private LoginCallbackListener loginCallbackListener;
    private ImageView userFingerPrintClick;

    private void initUIView(View paramView) {
        this.userFingerPrintClick = ((ImageView) paramView.findViewById(R.id.userFingerPrintClick));
        this.userFingerPrintClick.setOnClickListener(this);
    }

    public void onClick(View paramView) {
        if (paramView == this.userFingerPrintClick) {
            this.loginCallbackListener.homeTabView();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle) {
        return paramLayoutInflater.inflate(R.layout.finger_print_view, paramViewGroup, false);
    }

    public void onViewCreated(View paramView, @Nullable Bundle paramBundle) {
        super.onViewCreated(paramView, paramBundle);
        this.loginCallbackListener = ((LoginCallbackListener) getActivity());
        initUIView(paramView);
    }
}

