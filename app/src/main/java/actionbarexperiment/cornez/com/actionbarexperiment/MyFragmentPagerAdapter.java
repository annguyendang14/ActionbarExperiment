package actionbarexperiment.cornez.com.actionbarexperiment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by annguyendang14 on 3/19/2018.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter{
    final int PAGE_COUNT = 4;
    private String tabTitles[];
    private Context context;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

        tabTitles = new String[] { context.getString(R.string.ui_tabname_breakfast), context.getString(R.string.ui_tabname_lunch), context.getString(R.string.ui_tabname_snack), context.getString(R.string.ui_tabname_dinner) };
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BreakfastFragment();
            case 1:
                return new LunchFragment();
            case 2:
                return new SnackFragment();
            case 3:
                return new DinnerFragment();

        }
        return new BreakfastFragment();
    }

}
