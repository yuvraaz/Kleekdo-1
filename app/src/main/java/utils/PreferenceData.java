package utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class PreferenceData
{
  private SharedPreferences prefs;
  
  public PreferenceData(Context paramContext)
  {
    this.prefs = paramContext.getSharedPreferences("com.app.kleedo", 0);
  }
  
  public boolean getSlideScreenIsViewable()
  {
    return this.prefs.getBoolean("slideViewSee", false);
  }
  
  public void setSlideScreenOneTime()
  {
    Editor localEditor = this.prefs.edit();
    localEditor.putBoolean("slideViewSee", true);
    localEditor.commit();
  }
}

