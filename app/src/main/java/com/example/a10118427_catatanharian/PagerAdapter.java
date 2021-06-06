package com.example.a10118427_catatanharian;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.a10118427_catatanharian.ui.home.HomeFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

     public PagerAdapter(FragmentManager fm, int NumberOfTabs )
     {
         super(fm);
         this.mNoOfTabs = NumberOfTabs;
     }

    @Override
    public Fragment getItem(int position) {
         switch (position)
         {
             case 0:
                 HomeFragment homeFragment = new HomeFragment();


             case 1:
                 InformasiFragment tab2 = new InformasiFragment();
                 return tab2;
             default:
                 return null;

         }


    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
