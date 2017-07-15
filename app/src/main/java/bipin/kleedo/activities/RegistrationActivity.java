package bipin.kleedo.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

import bipin.kleedo.R;
import bipin.kleedo.activities.view.AlmostDoneView;
import bipin.kleedo.activities.view.JoinUsView;
import delegates.RegistrationDelegates;


public class RegistrationActivity
  extends AbstractBaseActivity
  implements RegistrationDelegates, OnClickListener
{
  private LinearLayout registerHere;
  
  private void initUIView()
  {
    this.registerHere = ((LinearLayout)findViewById(R.id.registerHere));
    this.registerHere.setOnClickListener(this);
    setFragmentView(R.id.registrationBaseContainer, new JoinUsView(), false);
  }
  
  public void almostDone()
  {
    setFragmentView(R.id.registrationBaseContainer, new AlmostDoneView(), true);
  }
  
  protected int getLayoutView()
  {
    return R.layout.registration_base;
  }
  
  public void onClick(View paramView)
  {
    onBackPressed();
  }
  
  protected void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initUIView();
  }
}

