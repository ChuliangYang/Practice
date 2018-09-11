package com.me.cl.template.presentation.di;

import android.app.Activity;
import com.me.cl.template.presentation.ui.LoginWelcomeActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainActivitySubComponentModule_WelcomeActivityInjector.LoginWelcomeActivitySubcomponent.class
)
public abstract class MainActivitySubComponentModule_WelcomeActivityInjector {
  private MainActivitySubComponentModule_WelcomeActivityInjector() {}

  @Binds
  @IntoMap
  @ActivityKey(LoginWelcomeActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      LoginWelcomeActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface LoginWelcomeActivitySubcomponent extends AndroidInjector<LoginWelcomeActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginWelcomeActivity> {}
  }
}
