// Generated by Dagger (https://google.github.io/dagger).
package com.me.cl.template.presentation.ui;

import android.support.v4.app.Fragment;
import com.me.cl.template.presentation.ui.base.InjectableFragmentActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider;

  public MainActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider) {
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider) {
    return new MainActivity_MembersInjector(dispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    InjectableFragmentActivity_MembersInjector.injectDispatchingAndroidInjector(
        instance, dispatchingAndroidInjectorProvider.get());
  }
}