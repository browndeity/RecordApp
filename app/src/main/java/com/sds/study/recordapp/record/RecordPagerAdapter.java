package com.sds.study.recordapp.record;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**

    Controller

 */

public class RecordPagerAdapter extends FragmentStatePagerAdapter{

    Fragment[] fragments = new Fragment[2];

    public RecordPagerAdapter(FragmentManager fm){

        super(fm);

        fragments[0] = new ListFragment();
        fragments[1] = new DetailFragment();

    }

    @Override
    public Fragment getItem(int position){

        return fragments[position];
    }

    @Override
    public int getCount(){

        return fragments.length;
    }
}
