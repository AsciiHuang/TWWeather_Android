package com.ascii.twweather;

import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;

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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		if (!drawerLayout.isDrawerOpen(Gravity.LEFT)) {
			// Only show items in the action bar relevant to this screen
			// if the drawer is not showing. Otherwise, let the drawer
			// decide what to show in the action bar.
			getMenuInflater().inflate(R.menu.menu_main, menu);
//			restoreActionBar();
			return true;
		}
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.menu_global_search) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	protected void initDrawer() {
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		toolbar.setTitle(R.string.app_name);
		drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
		drawerToggle = new ActionBarDrawerToggle(this,
				drawerLayout,
				toolbar,
				R.string.navigation_drawer_open,
				R.string.navigation_drawer_close) {
		};
		drawerLayout.setDrawerListener(drawerToggle);
		drawerToggle.syncState();
	}
}
