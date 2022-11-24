package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class BhupendraAdapter extends FragmentPagerAdapter {

    public BhupendraAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new BhupendraoneFragment();

            case 1:
                return new BhupendratwoFragment();

            case 2:
                return new BhupendrathreeFragment();


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {

            case 0:
                return "B One";


            case 1:
                return "B Two";

            case 2:
                return "B three";



            default:
                return null;

        }
    }
}
