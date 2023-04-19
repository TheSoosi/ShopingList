package com.example.shopinglist;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.shopinglist.fragments.AddNewFragment;
import com.example.shopinglist.fragments.ListFragment;

public class TabPagerAdapter extends FragmentStateAdapter {
    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ListFragment();

            case 1:
                return new AddNewFragment();

            default:
                return new AddNewFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
