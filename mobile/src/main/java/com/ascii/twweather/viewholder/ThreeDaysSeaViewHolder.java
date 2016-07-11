package com.ascii.twweather.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ThreeDaysSeaViewHolder extends RecyclerView.ViewHolder {

	// 每個 item 只顯示當前一筆，點下後才進入顯示三筆的細節頁
	public TextView locationName; // "黃海南部海面"
	public TextView publishTime; // "2016-01-28 23:00:00"
	public TextView id; // "1"

	public TextView wave; // "大浪轉小浪"
	public TextView date; // "2016-01-29"
	public TextView description; // "多雲時陰短暫陣雨"
	public TextView wind; // "偏北轉東北風"
	public TextView windScale; // "5至6陣風8級下午轉4至5陣風7級"

	public ThreeDaysSeaViewHolder(View itemView) {
		super(itemView);
	}

}
