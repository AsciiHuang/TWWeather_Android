package com.ascii.twweather;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class TWWeather extends Application {

	private RequestQueue queue;

	@Override
	public void onCreate() {
		super.onCreate();
		queue = Volley.newRequestQueue(this);
	}

	public void cancelRequest(String tag) {

	}

	public void stringRequest(StringRequest request) {
		queue.cancelAll(request.getTag());
		queue.add(request);
	}

}
