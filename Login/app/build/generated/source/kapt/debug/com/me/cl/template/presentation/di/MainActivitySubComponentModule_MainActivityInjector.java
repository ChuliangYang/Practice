package com.me.cl.template.presentation.di;

import android.app.Activity;
import com.me.cl.template.presentation.ui.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = MainActivitySubComponentModule_MainActivityInjector.MainActivitySubcomponent.class
)
public abstract class MainActivitySubComponentModule_MainActivityInjector {
  private MainActivitySubComponentModule_MainActivityInjector() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {MainActivityModule.class, MainActivityFragmentSubComponentModule.class})
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
