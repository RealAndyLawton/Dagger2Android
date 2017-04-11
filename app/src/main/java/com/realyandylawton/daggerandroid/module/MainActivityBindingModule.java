package com.realyandylawton.daggerandroid.module;

import android.app.Activity;
import com.realyandylawton.daggerandroid.MainActivity;
import com.realyandylawton.daggerandroid.component.MainActivityComponent;
import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.inject.Singleton;

@Singleton
@Module(subcomponents = MainActivityComponent.class)
public abstract class MainActivityBindingModule {

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(
      MainActivityComponent.Builder builder);

}

