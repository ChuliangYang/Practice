package com.me.cl.template.presentation.di;

import android.support.v4.app.Fragment;
import com.me.cl.template.framework.di.PerFragment;
import com.me.cl.template.presentation.ui.MainActivityFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainActivityFragmentSubComponentModule_CityListFragmentInjector
          .MainActivityFragmentSubcomponent.class
)
public abstract class MainActivityFragmentSubComponentModule_CityListFragmentInjector {
  private MainActivityFragmentSubComponentModule_CityListFragmentInjector() {}

  @Binds
  @IntoMap
  @FragmentKey(MainActivityFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      MainActivityFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = MainActivityFragmentModule.class)
  @PerFragment
  public interface MainActivityFragmentSubcomponent extends AndroidInjector<MainActivityFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivityFragment> {}
  }
}
