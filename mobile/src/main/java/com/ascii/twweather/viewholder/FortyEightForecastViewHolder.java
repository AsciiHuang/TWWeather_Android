package com.ascii.twweather.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class FortyEightForecastViewHolder extends RecyclerView.ViewHolder {

	// 每個 item 只顯示當前一筆，點下後才進入顯示三筆的細節頁
	public TextView locationName; // "台北市"
	public TextView weekLocation; // "Taipei"
	public TextView id; // "1"

	public TextView rain; // "40"
	public TextView beginTime; // "2016-01-29 00:00:00"
	public TextView title; // "今晚明晨"
	public TextView description; // "多雲時陰短暫陣雨"
	public TextView temperature; // "17 ~ 17"
	public TextView endTime; // "2016-01-29 06:00:00"

	public FortyEightForecastViewHolder(View itemView) {
		super(itemView);
	}

}
