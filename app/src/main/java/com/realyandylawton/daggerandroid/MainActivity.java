package com.realyandylawton.daggerandroid;

import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import dagger.android.AndroidInjection;
import java.util.List;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  @Inject
  MainAdapter adapter;
  @Inject
  LocationManager locationManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    AndroidInjection.inject(this);
    final ListView listView = new ListView(this);
    setContentView(listView,
        new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
    listView.setAdapter(adapter);

    final List<String> locationProviders = locationManager.getAllProviders();
    adapter.addAll(locationProviders);
  }

}
