package bipin.kleedo.activities.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;


import bipin.kleedo.R;
import delegates.LoginCallbackListener;

public class PasswordView
  extends Fragment
  implements OnClickListener
{
  private RelativeLayout eightBtn;
  private RelativeLayout fiveBtn;
  private RelativeLayout fourBtn;
  private LoginCallbackListener loginCallbackListener;
  private RelativeLayout nineBtn;
  private RelativeLayout oneBtn;
  private EditText pinCodeEdit;
  private RelativeLayout sevenBtn;
  private RelativeLayout sixBtn;
  private RelativeLayout threeBtn;
  private RelativeLayout twoBtn;
  private RelativeLayout zeroBtn;
  
  private void initUIView(View paramView)
  {
    this.pinCodeEdit = ((EditText)paramView.findViewById(R.id.pinCodeEdit));
    this.oneBtn = ((RelativeLayout)paramView.findViewById(R.id.oneBtn));
    this.twoBtn = ((RelativeLayout)paramView.findViewById(R.id.twoBtn));
    this.threeBtn = ((RelativeLayout)paramView.findViewById(R.id.threeBtn));
    this.fourBtn = ((RelativeLayout)paramView.findViewById(R.id.fourBtn));
    this.fiveBtn = ((RelativeLayout)paramView.findViewById(R.id.fiveBtn));
    this.sixBtn = ((RelativeLayout)paramView.findViewById(R.id.sixBtn));
    this.sevenBtn = ((RelativeLayout)paramView.findViewById(R.id.sevenBtn));
    this.eightBtn = ((RelativeLayout)paramView.findViewById(R.id.eightBtn));
    this.nineBtn = ((RelativeLayout)paramView.findViewById(R.id.nineBtn));
    this.zeroBtn = ((RelativeLayout)paramView.findViewById(R.id.zeroBtn));
    this.oneBtn.setOnClickListener(this);
    this.twoBtn.setOnClickListener(this);
    this.threeBtn.setOnClickListener(this);
    this.fourBtn.setOnClickListener(this);
    this.fiveBtn.setOnClickListener(this);
    this.sixBtn.setOnClickListener(this);
    this.sevenBtn.setOnClickListener(this);
    this.eightBtn.setOnClickListener(this);
    this.nineBtn.setOnClickListener(this);
    this.zeroBtn.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.oneBtn) {
      this.loginCallbackListener.fingerPrintView();
    }
    do
    {
//      return;
      if (paramView == this.twoBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.threeBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.fourBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.fiveBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.sixBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.sevenBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.eightBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.nineBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
    } while (paramView != this.zeroBtn);
    Toast.makeText(getActivity(), "Zero", Toast.LENGTH_LONG).show();
    this.loginCallbackListener.fingerPrintView();
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(R.layout.password_view, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.loginCallbackListener = ((LoginCallbackListener)getActivity());
    initUIView(paramView);
  }
}


