// Generated by Dagger (https://google.github.io/dagger).
package com.me.cl.template.presentation.di;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.v4.app.Fragment;
import com.me.cl.template.MyApplication;
import com.me.cl.template.MyApplication_MembersInjector;
import com.me.cl.template.framework.data.local.room.AppDatabase;
import com.me.cl.template.framework.viewmodel.MyViewModelFactory_Factory;
import com.me.cl.template.presentation.repos.LoginRepository_Factory;
import com.me.cl.template.presentation.ui.LoginWelcomeActivity;
import com.me.cl.template.presentation.ui.LoginWelcomeActivity_MembersInjector;
import com.me.cl.template.presentation.ui.MainActivity;
import com.me.cl.template.presentation.ui.MainActivityFragment;
import com.me.cl.template.presentation.ui.MainActivityFragment_MembersInjector;
import com.me.cl.template.presentation.ui.base.InjectableFragmentActivity_MembersInjector;
import com.me.cl.template.presentation.viewmodel.LoginViewModel;
import com.me.cl.template.presentation.viewmodel.LoginViewModel_Factory;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private Provider<
          MainActivitySubComponentModule_MainActivityInjector.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<
          MainActivitySubComponentModule_WelcomeActivityInjector.LoginWelcomeActivitySubcomponent
              .Builder>
      loginWelcomeActivitySubcomponentBuilderProvider;

  private Provider<Application> applicationProvider;

  private Provider<AppDatabase> provideRoomDataBaseProvider;

  private ViewModelModule_ProvideUserDaoFactory provideUserDaoProvider;

  private LoginRepository_Factory loginRepositoryProvider;

  private LoginViewModel_Factory loginViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>>
      mapOfClassOfAndProviderOfViewModelProvider;

  private MyViewModelFactory_Factory myViewModelFactoryProvider;

  private Provider<ViewModelProvider.Factory> bindViewModelFactoryProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            newMapBuilder(2)
        .put(MainActivity.class, (Provider) mainActivitySubcomponentBuilderProvider)
        .put(LoginWelcomeActivity.class, (Provider) loginWelcomeActivitySubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<? extends Activity>>>emptyMap());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.mainActivitySubcomponentBuilderProvider =
        new Provider<
            MainActivitySubComponentModule_MainActivityInjector.MainActivitySubcomponent
                .Builder>() {
          @Override
          public MainActivitySubComponentModule_MainActivityInjector.MainActivitySubcomponent
                  .Builder
              get() {
            return new MainActivitySubcomponentBuilder();
          }
        };
    this.loginWelcomeActivitySubcomponentBuilderProvider =
        new Provider<
            MainActivitySubComponentModule_WelcomeActivityInjector.LoginWelcomeActivitySubcomponent
                .Builder>() {
          @Override
          public MainActivitySubComponentModule_WelcomeActivityInjector
                  .LoginWelcomeActivitySubcomponent.Builder
              get() {
            return new LoginWelcomeActivitySubcomponentBuilder();
          }
        };
    this.applicationProvider = InstanceFactory.create(builder.application);
    this.provideRoomDataBaseProvider =
        DoubleCheck.provider(
            AppModule_ProvideRoomDataBaseFactory.create(builder.appModule, applicationProvider));
    this.provideUserDaoProvider =
        ViewModelModule_ProvideUserDaoFactory.create(provideRoomDataBaseProvider);
    this.loginRepositoryProvider = LoginRepository_Factory.create(provideUserDaoProvider);
    this.loginViewModelProvider = LoginViewModel_Factory.create(loginRepositoryProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider =
        MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(1)
            .put(LoginViewModel.class, (Provider) loginViewModelProvider)
            .build();
    this.myViewModelFactoryProvider =
        MyViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider);
    this.bindViewModelFactoryProvider = DoubleCheck.provider((Provider) myViewModelFactoryProvider);
  }

  @Override
  public void inject(MyApplication application) {
    injectMyApplication(application);
  }

  private MyApplication injectMyApplication(MyApplication instance) {
    MyApplication_MembersInjector.injectDispatchingAndroidInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private Application application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (application == null) {
        throw new IllegalStateException(Application.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends MainActivitySubComponentModule_MainActivityInjector.MainActivitySubcomponent.Builder {
    private MainActivity seedInstance;

    @Override
    public MainActivitySubComponentModule_MainActivityInjector.MainActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements MainActivitySubComponentModule_MainActivityInjector.MainActivitySubcomponent {
    private Provider<
            MainActivityFragmentSubComponentModule_CityListFragmentInjector
                .MainActivityFragmentSubcomponent.Builder>
        mainActivityFragmentSubcomponentBuilderProvider;

    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return Collections
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              singletonMap(
                  MainActivityFragment.class,
                  (Provider) mainActivityFragmentSubcomponentBuilderProvider);
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<? extends Fragment>>>emptyMap());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivitySubcomponentBuilder builder) {
      this.mainActivityFragmentSubcomponentBuilderProvider =
          new Provider<
              MainActivityFragmentSubComponentModule_CityListFragmentInjector
                  .MainActivityFragmentSubcomponent.Builder>() {
            @Override
            public MainActivityFragmentSubComponentModule_CityListFragmentInjector
                    .MainActivityFragmentSubcomponent.Builder
                get() {
              return new MainActivityFragmentSubcomponentBuilder();
            }
          };
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      InjectableFragmentActivity_MembersInjector.injectDispatchingAndroidInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      return instance;
    }

    private final class MainActivityFragmentSubcomponentBuilder
        extends MainActivityFragmentSubComponentModule_CityListFragmentInjector
            .MainActivityFragmentSubcomponent.Builder {
      private MainActivityFragment seedInstance;

      @Override
      public MainActivityFragmentSubComponentModule_CityListFragmentInjector
              .MainActivityFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              MainActivityFragment.class.getCanonicalName() + " must be set");
        }
        return new MainActivityFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(MainActivityFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class MainActivityFragmentSubcomponentImpl
        implements MainActivityFragmentSubComponentModule_CityListFragmentInjector
            .MainActivityFragmentSubcomponent {
      private MainActivityFragmentSubcomponentImpl(
          MainActivityFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(MainActivityFragment arg0) {
        injectMainActivityFragment(arg0);
      }

      private MainActivityFragment injectMainActivityFragment(MainActivityFragment instance) {
        MainActivityFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.bindViewModelFactoryProvider.get());
        return instance;
      }
    }
  }

  private final class LoginWelcomeActivitySubcomponentBuilder
      extends MainActivitySubComponentModule_WelcomeActivityInjector
          .LoginWelcomeActivitySubcomponent.Builder {
    private LoginWelcomeActivity seedInstance;

    @Override
    public MainActivitySubComponentModule_WelcomeActivityInjector.LoginWelcomeActivitySubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            LoginWelcomeActivity.class.getCanonicalName() + " must be set");
      }
      return new LoginWelcomeActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(LoginWelcomeActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class LoginWelcomeActivitySubcomponentImpl
      implements MainActivitySubComponentModule_WelcomeActivityInjector
          .LoginWelcomeActivitySubcomponent {
    private LoginWelcomeActivitySubcomponentImpl(LoginWelcomeActivitySubcomponentBuilder builder) {}

    @Override
    public void inject(LoginWelcomeActivity arg0) {
      injectLoginWelcomeActivity(arg0);
    }

    private LoginWelcomeActivity injectLoginWelcomeActivity(LoginWelcomeActivity instance) {
      LoginWelcomeActivity_MembersInjector.injectViewModelFactory(
          instance, DaggerAppComponent.this.bindViewModelFactoryProvider.get());
      return instance;
    }
  }
}
