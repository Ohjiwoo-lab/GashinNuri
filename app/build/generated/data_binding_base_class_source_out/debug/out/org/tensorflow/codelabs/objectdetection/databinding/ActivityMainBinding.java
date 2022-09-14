// Generated by view binder compiler. Do not edit!
package org.tensorflow.codelabs.objectdetection.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.codelabs.objectdetection.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button captureImageFab;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imgSampleOne;

  @NonNull
  public final ImageView imgSampleThree;

  @NonNull
  public final ImageView imgSampleTwo;

  @NonNull
  public final LinearLayout llSampleImage;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvPlaceholder;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull Button captureImageFab,
      @NonNull ImageView imageView, @NonNull ImageView imgSampleOne,
      @NonNull ImageView imgSampleThree, @NonNull ImageView imgSampleTwo,
      @NonNull LinearLayout llSampleImage, @NonNull TextView tvDescription,
      @NonNull TextView tvPlaceholder) {
    this.rootView = rootView;
    this.captureImageFab = captureImageFab;
    this.imageView = imageView;
    this.imgSampleOne = imgSampleOne;
    this.imgSampleThree = imgSampleThree;
    this.imgSampleTwo = imgSampleTwo;
    this.llSampleImage = llSampleImage;
    this.tvDescription = tvDescription;
    this.tvPlaceholder = tvPlaceholder;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.captureImageFab;
      Button captureImageFab = rootView.findViewById(id);
      if (captureImageFab == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imgSampleOne;
      ImageView imgSampleOne = rootView.findViewById(id);
      if (imgSampleOne == null) {
        break missingId;
      }

      id = R.id.imgSampleThree;
      ImageView imgSampleThree = rootView.findViewById(id);
      if (imgSampleThree == null) {
        break missingId;
      }

      id = R.id.imgSampleTwo;
      ImageView imgSampleTwo = rootView.findViewById(id);
      if (imgSampleTwo == null) {
        break missingId;
      }

      id = R.id.llSampleImage;
      LinearLayout llSampleImage = rootView.findViewById(id);
      if (llSampleImage == null) {
        break missingId;
      }

      id = R.id.tvDescription;
      TextView tvDescription = rootView.findViewById(id);
      if (tvDescription == null) {
        break missingId;
      }

      id = R.id.tvPlaceholder;
      TextView tvPlaceholder = rootView.findViewById(id);
      if (tvPlaceholder == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, captureImageFab, imageView,
          imgSampleOne, imgSampleThree, imgSampleTwo, llSampleImage, tvDescription, tvPlaceholder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
