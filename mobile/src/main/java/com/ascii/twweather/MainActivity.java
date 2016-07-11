package com.ascii.twweather;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.android.volley.toolbox.Volley;
import com.ascii.twweather.adapter.PortalPagerAdapter;
import com.ascii.twweather.fragment.FortyEightForecastFragment;
import com.ascii.twweather.fragment.GlobalFragment;
import com.ascii.twweather.fragment.TextListFragment;
import com.ascii.twweather.fragment.NearSeaFragment;
import com.ascii.twweather.fragment.ObsFragment;
import com.ascii.twweather.fragment.OneWeekForecastFragment;
import com.ascii.twweather.fragment.OneWeekTravelFragment;
import com.ascii.twweather.fragment.PreferencePortalFragment;
import com.ascii.twweather.fragment.ThreeDaysSeaFragment;
import com.ascii.twweather.fragment.TideFragment;
import com.ascii.twweather.listener.OnFragmentInteractionListener;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {

	// http://twweatherapi.herokuapp.com/
	// http://opendata.epa.gov.tw/ws/Data/AQX/?format=json

	private ActionBarDrawerToggle drawerToggle;
	private DrawerLayout drawerLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initDrawer();
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		if (drawerToggle != null) {
			drawerToggle.syncState();
		}
		navigateToDefaultFragment();
//		MenuItem menuItem = (MenuItem) findViewById(R.id.navigation_item_forty_eight_forecast);
//		menuItem.setChecked(true);
	}

	private void navigateToDefaultFragment() {
		FragmentManager manager = getFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		Fragment currentFragment = manager.findFragmentById(R.id.main_fragment);
		if (currentFragment == null) {
			transaction.replace(R.id.main_fragment, PreferencePortalFragment.newInstance());
			transaction.commit();
		}
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		if (drawerToggle != null) {
			drawerToggle.onConfigurationChanged(newConfig);
		}
	}

	protected void initDrawer() {
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		toolbar.setTitle(R.string.app_name);
		drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
		drawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
		drawerToggle = new ActionBarDrawerToggle(this,
				drawerLayout,
				toolbar,
				R.string.navigation_drawer_open,
				R.string.navigation_drawer_close) {
		};
		drawerLayout.setDrawerListener(drawerToggle);
		drawerToggle.syncState();
		NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_drawer);
		navigationView.setNavigationItemSelectedListener(onNavigationItemSelected);
	}

	private NavigationView.OnNavigationItemSelectedListener onNavigationItemSelected = new NavigationView.OnNavigationItemSelectedListener() {
		@Override
		public boolean onNavigationItemSelected(MenuItem menuItem) {
			switchFragment(menuItem.getItemId());
			menuItem.setChecked(true);
			drawerLayout.closeDrawers();
			return false;
		}
	};

	private void switchFragment(int id) {
		FragmentManager manager = getFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		Fragment currentFragment = manager.findFragmentById(R.id.main_fragment);
		boolean isCurrentFragment = false;
		switch (id) {
			case R.id.navigation_item_preference_portal:
				isCurrentFragment = currentFragment instanceof PreferencePortalFragment;
				transaction.replace(R.id.main_fragment, PreferencePortalFragment.newInstance());
				break;
			case R.id.navigation_item_forty_eight_forecast:
				isCurrentFragment = currentFragment instanceof FortyEightForecastFragment;
				transaction.replace(R.id.main_fragment, FortyEightForecastFragment.newInstance("", ""));
				break;
			case R.id.navigation_item_one_week_forecast:
				isCurrentFragment = currentFragment instanceof OneWeekForecastFragment;
				transaction.replace(R.id.main_fragment, OneWeekForecastFragment.newInstance("", ""));
				break;
			case R.id.navigation_item_one_week_travel:
				isCurrentFragment = currentFragment instanceof OneWeekTravelFragment;
				transaction.replace(R.id.main_fragment, OneWeekTravelFragment.newInstance("", ""));
				break;
			case R.id.navigation_item_three_days_sea:
				isCurrentFragment = currentFragment instanceof ThreeDaysSeaFragment;
				transaction.replace(R.id.main_fragment, ThreeDaysSeaFragment.newInstance("", ""));
				break;
			case R.id.navigation_item_near_sea:
				isCurrentFragment = currentFragment instanceof NearSeaFragment;
				transaction.replace(R.id.main_fragment, NearSeaFragment.newInstance("", ""));
				break;
			case R.id.navigation_item_tide:
				isCurrentFragment = currentFragment instanceof TideFragment;
				transaction.replace(R.id.main_fragment, TideFragment.newInstance("", ""));
				break;
			case R.id.navigation_item_obs:
				isCurrentFragment = currentFragment instanceof ObsFragment;
				transaction.replace(R.id.main_fragment, ObsFragment.newInstance("", ""));
				break;
			case R.id.navigation_item_global:
				isCurrentFragment = currentFragment instanceof GlobalFragment;
				transaction.replace(R.id.main_fragment, GlobalFragment.newInstance("", ""));
				break;
			case R.id.navigation_item_images:
				isCurrentFragment = currentFragment instanceof TextListFragment;
				transaction.replace(R.id.main_fragment, TextListFragment.newInstance());
				break;
			default:
				break;
		}
		if (!isCurrentFragment) {
			transaction.commit();
		}
	}

	@Override
	public void onBackPressed() {
		FragmentManager fragmentManager = getFragmentManager();
		if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
			drawerLayout.closeDrawers();
		} else if (fragmentManager.getBackStackEntryCount() > 0) {
			fragmentManager.popBackStack();
		} else {
			super.onBackPressed();
		}
	}

	@Override
	public void onFragmentInteraction(Uri uri) {

	}

	@Override
	public void onFragmentInteraction(String id) {

	}
}
