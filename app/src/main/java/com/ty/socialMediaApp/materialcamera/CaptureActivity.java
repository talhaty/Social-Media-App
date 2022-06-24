package com.ty.socialMediaApp.materialcamera;

import android.app.Fragment;
import androidx.annotation.NonNull;

import com.ty.socialMediaApp.materialcamera.internal.BaseCaptureActivity;
import com.ty.socialMediaApp.materialcamera.internal.CameraFragment;

public class CaptureActivity extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return CameraFragment.newInstance();
  }
}
