package com.ascii.twweather.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class CountryViewHolder extends RecyclerView.ViewHolder {

	public TextView area; // "亞洲"
	public TextView avgRain; // ""
	public TextView validDate; // ""
	public TextView locationName; // "東京"
	public TextView forecast; // ""
	public TextView avgTemperature; // "0"
	public TextView temperature; // ""
	public TextView forecastDate; // ""
	public TextView id; // "TOKYO"

	public CountryViewHolder(View itemView) {
		super(itemView);
	}

}
