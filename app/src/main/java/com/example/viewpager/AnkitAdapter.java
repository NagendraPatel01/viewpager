package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AnkitAdapter extends FragmentPagerAdapter {

    public AnkitAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new AnkitoneFragment();

            case 1:
                return new AnkittwoFragment();

            case 2:
                return new AnkitthreeFragment();


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
                return "A One";


            case 1:
                return "A Two";

            case 2:
                return "A three";



            default:
                return null;

        }
    }
}
