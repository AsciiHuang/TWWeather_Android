package com.ascii.twweather.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by asciihuang on 2016/1/4.
 */
public class WeekForecastViewHolder extends RecyclerView.ViewHolder {

	// 每個 item 只顯示當前一筆，點下後才進入顯示三筆的細節頁
	public TextView locationName; // "台北市"
	public TextView publishTime; // "2016-01-28 23:00:00"
	public TextView id; // "1"

	public TextView temperature; // "17 ~ 17"
	public TextView date; // "2016-01-29"
	public TextView description; // "多雲時陰短暫陣雨"
	public TextView day; // "晚上"

	public WeekForecastViewHolder(View itemView) {
		super(itemView);
	}

}
