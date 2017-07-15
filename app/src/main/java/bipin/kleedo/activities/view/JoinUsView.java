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
import delegates.RegistrationDelegates;

public class JoinUsView
        extends Fragment
        implements OnClickListener {
    private ImageView registrationBtnView;
    private RegistrationDelegates registrationDelegates;

    private void initUIView(View paramView) {
        this.registrationBtnView = ((ImageView) paramView.findViewById(R.id.registrationBtnView));
        this.registrationBtnView.setOnClickListener(this);
    }

    public void onClick(View paramView) {
        this.registrationDelegates.almostDone();
    }

    @Nullable
    public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle) {
        return paramLayoutInflater.inflate(R.layout.joingus_view, paramViewGroup, false);
    }

    public void onViewCreated(View paramView, @Nullable Bundle paramBundle) {
        super.onViewCreated(paramView, paramBundle);
        this.registrationDelegates = ((RegistrationDelegates) getActivity());
        initUIView(paramView);
    }
}


