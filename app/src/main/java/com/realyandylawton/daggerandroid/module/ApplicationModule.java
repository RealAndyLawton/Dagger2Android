package com.realyandylawton.daggerandroid.module;

import android.content.Context;
import android.location.LocationManager;
import com.realyandylawton.daggerandroid.DaggerApplication;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ApplicationModule {

  @Provides
  @Singleton
  LocationManager provideLocationManager(DaggerApplication application) {
    return (LocationManager) application.getSystemService(Context.LOCATION_SERVICE);
  }

}
