package actionbarexperiment.cornez.com.actionbarexperiment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.v4.view.ViewPager;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager) ;
        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(),
                MyActivity.this));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);










    }

}
