package com.example.walkzz;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.walkzz.fragment.allFragment;
import com.example.walkzz.fragment.categoriesFragment;
import com.example.walkzz.fragment.exploreFragment;

public class viewPagerAdapter extends FragmentStateAdapter {

    public viewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){

            case 1:
                return new allFragment();
            case 2:
                return new categoriesFragment();
            case 3:
            default:
                return new exploreFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
