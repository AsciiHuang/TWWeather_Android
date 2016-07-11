package com.ascii.twweather.adapter;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;

import com.ascii.twweather.R;
import com.ascii.twweather.fragment.TextListFragment;

public class PortalPagerAdapter extends FragmentPagerAdapter {

	private Activity activity;
	private static final int pageCount = 3;

	public static class PortalPagerType {
		public static final int Preference = 0;
		public static final int Overview = 1;
		public static final int Atmospheric = 2;
	}

	public PortalPagerAdapter(Activity activity, FragmentManager fm) {
		super(fm);
		this.activity = activity;
	}

	@Override
	public int getCount() {
		return pageCount;
	}

	@Override
	public Fragment getItem(int position) {
		Fragment fragment = TextListFragment.newInstance();
		Bundle bundle = new Bundle();
		switch (position) {
			case PortalPagerType.Preference:
				fragment = TextListFragment.newInstance();
				break;
			case PortalPagerType.Overview:
				fragment = TextListFragment.newInstance();
				break;
			case PortalPagerType.Atmospheric:
				fragment = TextListFragment.newInstance();
				break;
		}
		return fragment;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		String title = "";

		switch (position) {
			case PortalPagerType.Preference:
				title = activity.getString(R.string.preference);
				break;
			case PortalPagerType.Overview:
				title = activity.getString(R.string.overview);
				break;
			case PortalPagerType.Atmospheric:
				title = activity.getString(R.string.atmospheric);
				break;
		}

		return title;
	}
}
