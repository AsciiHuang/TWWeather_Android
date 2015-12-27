package com.ascii.twweather;

import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

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
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		if (drawerToggle != null) {
			drawerToggle.onConfigurationChanged(newConfig);
		}
	}

	protected void initDrawer() {
		drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
		drawerToggle = new ActionBarDrawerToggle(this,
				drawerLayout,
				R.string.navigation_drawer_open,
				R.string.navigation_drawer_close) {

		};
		drawerLayout.setDrawerListener(drawerToggle);
		drawerToggle.syncState();
	}
}
