package com.ascii.twweather.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class TideViewHolder extends RecyclerView.ViewHolder {

	// 每個 item 只顯示當前一筆，點下後才進入顯示三筆的細節頁
	public TextView locationName; // "釣魚台海面"
	public TextView id; // "1"

	public TextView date; // "2012-12-26"
	public TextView lunarDate; // "農曆11月14日"

	public TextView details;

	public TideViewHolder(View itemView) {
		super(itemView);
	}

}
