package bipin.kleedo.activities.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import bipin.kleedo.R;

public class ScreenSlidePageFragment
  extends Fragment
{
  private int position;
  private int[] resources = { R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five };
  private ImageView screenView;
  
  private void initUIView(View paramView)
  {
    this.screenView = ((ImageView)paramView.findViewById(R.id.screenView));
    this.screenView.setImageResource(this.resources[this.position]);
  }
  
  public static ScreenSlidePageFragment newInstance(int paramInt)
  {
    ScreenSlidePageFragment localScreenSlidePageFragment = new ScreenSlidePageFragment();
    localScreenSlidePageFragment.position = paramInt;
    return localScreenSlidePageFragment;
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(R.layout.slide_view, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


