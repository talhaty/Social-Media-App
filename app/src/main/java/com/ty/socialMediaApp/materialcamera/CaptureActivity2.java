package com.ty.socialMediaApp.materialcamera;

import android.app.Fragment;
import androidx.annotation.NonNull;

import com.ty.socialMediaApp.materialcamera.internal.BaseCaptureActivity;
import com.ty.socialMediaApp.materialcamera.internal.Camera2Fragment;


public class CaptureActivity2 extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return Camera2Fragment.newInstance();
  }
}
