package com.realyandylawton.daggerandroid;

import android.app.Activity;
import android.app.Application;
import com.realyandylawton.daggerandroid.component.ApplicationComponent;
import com.realyandylawton.daggerandroid.component.DaggerApplicationComponent;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;
import javax.inject.Inject;

public class DaggerApplication extends Application implements HasDispatchingActivityInjector {

  @Inject
  DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

  @Override
  public void onCreate() {
    super.onCreate();
    final ApplicationComponent component = DaggerApplicationComponent.builder()
        .application(this)
        .build();
    component.inject(this);
  }

  @Override
  public DispatchingAndroidInjector<Activity> activityInjector() {
    return dispatchingActivityInjector;
  }
}
