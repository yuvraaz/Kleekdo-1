package utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class OpenSansLightTxt
  extends AppCompatTextView
{
  public OpenSansLightTxt(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public OpenSansLightTxt(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public OpenSansLightTxt(Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  public void init(Context paramContext)
  {
    setTypeface(Typeface.createFromAsset(paramContext.getAssets(), "OpenSans-Light.ttf"));
  }
}

