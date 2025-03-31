package com.example.week11;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabAdapter extends FragmentStateAdapter {

    public TabAdapter(@NonNull MainActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new TeamFragment();
            case 1:
                return new PlayerFragment();
            case 2:
                return new MatchFragment();
            default:
                return new TeamFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
