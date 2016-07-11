package com.ascii.twweather.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ObsViewHolder extends RecyclerView.ViewHolder {

	public TextView locationName; // "台北"
	public TextView gustWindScale; // "-"
	public TextView windDirection; // "東"
	public TextView description; // "X"
	public TextView rain; // "0.5"
	public TextView time; // "2016-01-29 00:15:00"
	public TextView temperature; // 17.2
	public TextView id; // "46692"
	public TextView windScale; // "1"

	public ObsViewHolder(View itemView) {
		super(itemView);
	}

}
