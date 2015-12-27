package com.ascii.twweather;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NavigationDrawerFragment extends Fragment {

	private ActionBarDrawerToggle mDrawerToggle;
	private View mFragmentContainerView;
	private DrawerLayout mDrawerLayout;
	private NavigationDrawerCallbacks mCallbacks;

	public interface NavigationDrawerCallbacks {
		void onNavigationDrawerItemSelected(int position);
		void onToolBarBackKeyClicked();
	}

	public void setUp(int fragmentId, DrawerLayout drawerLayout) {
		mFragmentContainerView = getActivity().findViewById(fragmentId);
		mDrawerLayout = drawerLayout;

//		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);

//		ActionBar actionBar = getActionBar();
//		actionBar.setDisplayHomeAsUpEnabled(true);
//		actionBar.setHomeButtonEnabled(true);

		// ActionBarDrawerToggle ties together the the proper interactions
		// between the navigation drawer and the action bar app icon.
		mDrawerToggle = new ActionBarDrawerToggle(
				getActivity(),
				mDrawerLayout,
				null,
				R.string.navigation_drawer_open,  /* "open drawer" description for accessibility */
				R.string.navigation_drawer_close  /* "close drawer" description for accessibility */
		) {
			@Override
			public void onDrawerClosed(View drawerView) {
				super.onDrawerClosed(drawerView);
				if (!isAdded()) {
					return;
				}

//				getActivity().supportInvalidateOptionsMenu(); // calls onPrepareOptionsMenu()
			}

			@Override
			public void onDrawerOpened(View drawerView) {
				super.onDrawerOpened(drawerView);
				if (!isAdded()) {
					return;
				}

//				if (!mUserLearnedDrawer) {
//					// The user manually opened the drawer; store this flag to prevent auto-showing
//					// the navigation drawer automatically in the future.
//					mUserLearnedDrawer = true;
//					SharedPreferences sp = PreferenceManager
//							.getDefaultSharedPreferences(getActivity());
//					sp.edit().putBoolean(PREF_USER_LEARNED_DRAWER, true).apply();
//				}
//
//				getActivity().supportInvalidateOptionsMenu(); // calls onPrepareOptionsMenu()
			}
		};

		mDrawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (mCallbacks != null) {
					mCallbacks.onToolBarBackKeyClicked();
				}
			}
		});

		// If the user hasn't 'learned' about the drawer, open it to introduce them to the drawer,
		// per the navigation drawer design guidelines.
//		if (!mUserLearnedDrawer && !mFromSavedInstanceState) {
//			mDrawerLayout.openDrawer(mFragmentContainerView);
//		}

		// Defer code dependent on restoration of previous instance state.
		mDrawerLayout.post(new Runnable() {
			@Override
			public void run() {
				mDrawerToggle.syncState();
			}
		});

		mDrawerLayout.setDrawerListener(mDrawerToggle);
	}

//	private ActionBar getActionBar() {
//		return ((AppCompatActivity) getActivity()).getActionBar();

//	}
}
