package bipin.kleedo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;


import bipin.kleedo.R;
import bipin.kleedo.activities.adpaters.ScreenSlidePagerAdapter;

public class ScreenSlidePagerActivity
  extends AbstractBaseActivity
{
  private boolean innterTab;
  private ScreenSlidePagerAdapter screenSlidePagerAdapter;
  private ViewPager viewPager;
  Intent localIntent;
  
  protected int getLayoutView()
  {
    return R.layout.slideing_view;
  }
  
  protected void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getExtras();
    if ((paramBundle != null) && (paramBundle.getBoolean("InnterTab"))) {
      this.innterTab = paramBundle.getBoolean("InnterTab");
    }
    this.viewPager = ((ViewPager)findViewById(R.id.pager));
    this.screenSlidePagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager(), 5);
    this.viewPager.setAdapter(this.screenSlidePagerAdapter);
    this.viewPager.addOnPageChangeListener(new OnPageChangeListener()
    {
      public void onPageScrollStateChanged(int paramAnonymousInt) {}
      
      public void onPageScrolled(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2) {}
      
      public void onPageSelected(int paramAnonymousInt)
      {
        if ((paramAnonymousInt == 4) && (!ScreenSlidePagerActivity.this.innterTab))
        {
          localIntent = new Intent(ScreenSlidePagerActivity.this, LoginActivity.class);
          ScreenSlidePagerActivity.this.startActivity(localIntent);
        }
        while (paramAnonymousInt != 4)
        {

          return;
        }
        ScreenSlidePagerActivity.this.finish();
      }
    });
  }
}


