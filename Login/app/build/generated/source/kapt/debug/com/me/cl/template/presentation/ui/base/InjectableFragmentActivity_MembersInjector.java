// Generated by Dagger (https://google.github.io/dagger).
package com.me.cl.template.presentation.ui.base;

import android.support.v4.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class InjectableFragmentActivity_MembersInjector
    implements MembersInjector<InjectableFragmentActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider;

  public InjectableFragmentActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider) {
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<InjectableFragmentActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider) {
    return new InjectableFragmentActivity_MembersInjector(dispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(InjectableFragmentActivity instance) {
    injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorProvider.get());
  }

  public static void injectDispatchingAndroidInjector(
      InjectableFragmentActivity instance,
      DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector) {
    instance.dispatchingAndroidInjector = dispatchingAndroidInjector;
  }
}
