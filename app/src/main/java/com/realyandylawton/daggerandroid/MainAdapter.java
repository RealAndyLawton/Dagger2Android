package com.realyandylawton.daggerandroid;

import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

public class MainAdapter extends ArrayAdapter<String> {

  public MainAdapter(@NonNull MainActivity mainActivity) {
    super(mainActivity, android.R.layout.simple_list_item_1);
  }
}
