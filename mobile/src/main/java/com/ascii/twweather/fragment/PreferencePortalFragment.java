package com.ascii.twweather.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ascii.twweather.R;
import com.ascii.twweather.adapter.PortalPagerAdapter;
import com.ascii.twweather.view.SlidingTabLayout;

public class PreferencePortalFragment extends Fragment {

	private SlidingTabLayout mSlidingTabLayout;
	private ViewPager mViewPager;

	public static PreferencePortalFragment newInstance() {
		return new PreferencePortalFragment();
	}

	public PreferencePortalFragment() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_preference_portal, container, false);

		mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
		mViewPager.setAdapter(new PortalPagerAdapter(getActivity(), getFragmentManager()));

		mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
		mSlidingTabLayout.setViewPager(mViewPager);

		return view;
	}

}
