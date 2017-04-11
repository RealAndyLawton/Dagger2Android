package com.realyandylawton.daggerandroid.component;

import com.realyandylawton.daggerandroid.DaggerApplication;
import com.realyandylawton.daggerandroid.module.ApplicationModule;
import com.realyandylawton.daggerandroid.module.MainActivityBindingModule;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = { ApplicationModule.class, MainActivityBindingModule.class, AndroidInjectionModule.class })
public interface ApplicationComponent  {

  @Component.Builder
  interface Builder {
    @BindsInstance Builder application(DaggerApplication application);
    ApplicationComponent build();
  }

  void inject(DaggerApplication application);

}
