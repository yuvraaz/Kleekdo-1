package utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class OpenSansRegularTxt
  extends AppCompatTextView
{
  public OpenSansRegularTxt(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public OpenSansRegularTxt(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public OpenSansRegularTxt(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    setTypeface(Typeface.createFromAsset(paramContext.getAssets(), "OpenSans-Regular.ttf"));
  }
}


