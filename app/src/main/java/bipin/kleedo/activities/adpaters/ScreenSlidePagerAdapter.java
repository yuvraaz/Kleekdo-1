package bipin.kleedo.activities.adpaters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import bipin.kleedo.activities.view.ScreenSlidePageFragment;

public class ScreenSlidePagerAdapter
  extends FragmentStatePagerAdapter
{
  private int NUM_PAGES;
  
  public ScreenSlidePagerAdapter(FragmentManager paramFragmentManager, int paramInt)
  {
    super(paramFragmentManager);
    this.NUM_PAGES = paramInt;
  }
  
  public int getCount()
  {
    return this.NUM_PAGES;
  }
  
  public Fragment getItem(int paramInt)
  {
    return ScreenSlidePageFragment.newInstance(paramInt);
  }
}

