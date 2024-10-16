// Generated by view binder compiler. Do not edit!
package com.example.firedatabase.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.firedatabase.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginFormBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText ed3;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final LinearLayout lin2;

  @NonNull
  public final EditText logtxt;

  @NonNull
  public final ConstraintLayout mainHeader;

  @NonNull
  public final TextView regisLink;

  @NonNull
  public final TextView text1;

  @NonNull
  public final TextView txt1;

  private ActivityLoginFormBinding(@NonNull ScrollView rootView, @NonNull Button btnLogin,
      @NonNull EditText ed3, @NonNull ImageView imageView2, @NonNull LinearLayout lin2,
      @NonNull EditText logtxt, @NonNull ConstraintLayout mainHeader, @NonNull TextView regisLink,
      @NonNull TextView text1, @NonNull TextView txt1) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.ed3 = ed3;
    this.imageView2 = imageView2;
    this.lin2 = lin2;
    this.logtxt = logtxt;
    this.mainHeader = mainHeader;
    this.regisLink = regisLink;
    this.text1 = text1;
    this.txt1 = txt1;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginFormBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginFormBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login_form, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginFormBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.ed3;
      EditText ed3 = ViewBindings.findChildViewById(rootView, id);
      if (ed3 == null) {
        break missingId;
      }

      id = R.id.image_view2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.lin2;
      LinearLayout lin2 = ViewBindings.findChildViewById(rootView, id);
      if (lin2 == null) {
        break missingId;
      }

      id = R.id.logtxt;
      EditText logtxt = ViewBindings.findChildViewById(rootView, id);
      if (logtxt == null) {
        break missingId;
      }

      id = R.id.main_header;
      ConstraintLayout mainHeader = ViewBindings.findChildViewById(rootView, id);
      if (mainHeader == null) {
        break missingId;
      }

      id = R.id.regis_link;
      TextView regisLink = ViewBindings.findChildViewById(rootView, id);
      if (regisLink == null) {
        break missingId;
      }

      id = R.id.text1;
      TextView text1 = ViewBindings.findChildViewById(rootView, id);
      if (text1 == null) {
        break missingId;
      }

      id = R.id.txt1;
      TextView txt1 = ViewBindings.findChildViewById(rootView, id);
      if (txt1 == null) {
        break missingId;
      }

      return new ActivityLoginFormBinding((ScrollView) rootView, btnLogin, ed3, imageView2, lin2,
          logtxt, mainHeader, regisLink, text1, txt1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
