package com.BV.LinearGradient;

import android.view.View;

import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;

public abstract class BVLinearGradientManagerSpec<T extends View> extends SimpleViewManager<T> {
  public abstract void setColors(LinearGradientView gradientView, ReadableArray colors);
  public abstract void setLocations(LinearGradientView gradientView, @Nullable ReadableArray locations);
  public abstract void setStartPoint(LinearGradientView gradientView, ReadableArray startPos);
  public abstract void setEndPoint(LinearGradientView gradientView, ReadableArray endPos);
  public abstract void setUseAngle(LinearGradientView gradientView, boolean useAngle);
  public abstract void setAngleCenter(LinearGradientView gradientView, ReadableArray in);
  public abstract void setAngle(LinearGradientView gradientView, float angle);
  public abstract void setBorderRadii(LinearGradientView gradientView, ReadableArray borderRadii);
}
