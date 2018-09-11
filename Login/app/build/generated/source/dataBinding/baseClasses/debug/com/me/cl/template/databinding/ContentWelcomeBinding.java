package com.me.cl.template.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.me.cl.template.presentation.entities.User;

public abstract class ContentWelcomeBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView toolbarTitle;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPhone;

  @Bindable
  protected User mUser;

  protected ContentWelcomeBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Toolbar toolbar, TextView toolbarTitle, TextView tvEmail,
      TextView tvName, TextView tvPhone) {
    super(_bindingComponent, _root, _localFieldCount);
    this.toolbar = toolbar;
    this.toolbarTitle = toolbarTitle;
    this.tvEmail = tvEmail;
    this.tvName = tvName;
    this.tvPhone = tvPhone;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  @NonNull
  public static ContentWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ContentWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ContentWelcomeBinding>inflate(inflater, com.me.cl.template.R.layout.content_welcome, root, attachToRoot, component);
  }

  @Nullable
  public static ContentWelcomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ContentWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ContentWelcomeBinding>inflate(inflater, com.me.cl.template.R.layout.content_welcome, null, false, component);
  }

  @NonNull
  public static ContentWelcomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ContentWelcomeBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ContentWelcomeBinding)bind(component, view, com.me.cl.template.R.layout.content_welcome);
  }
}
