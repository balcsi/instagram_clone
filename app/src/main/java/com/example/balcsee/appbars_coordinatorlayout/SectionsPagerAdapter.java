package com.example.balcsee.appbars_coordinatorlayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by balcsee on 2017.10.21..
 */

public class SectionsPagerAdapter extends FragmentStatePagerAdapter{


    private final List<Fragment> fragmentList = new ArrayList<>();


    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    void addFragment(Fragment f)
    {
        fragmentList.add(f);
    }
}
