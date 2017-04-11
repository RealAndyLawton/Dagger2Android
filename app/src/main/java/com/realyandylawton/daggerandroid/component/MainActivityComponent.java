package com.realyandylawton.daggerandroid.component;

import com.realyandylawton.daggerandroid.MainActivity;
import com.realyandylawton.daggerandroid.module.MainActivityModule;
import com.realyandylawton.daggerandroid.scope.ActivityScope;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

  void inject(MainActivity activity);

  @Subcomponent.Builder
  abstract class Builder extends AndroidInjector.Builder<MainActivity> {

  }
}
