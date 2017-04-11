package com.realyandylawton.daggerandroid.module;

import com.realyandylawton.daggerandroid.MainAdapter;
import com.realyandylawton.daggerandroid.MainActivity;
import com.realyandylawton.daggerandroid.scope.ActivityScope;
import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

  @ActivityScope
  @Provides
  MainAdapter provideCheeseAdapter(MainActivity mainActivity) {
    return new MainAdapter(mainActivity);
  }

}
