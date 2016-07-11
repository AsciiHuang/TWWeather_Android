package com.ascii.twweather.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NearSeaViewHolder extends RecyclerView.ViewHolder {

	public TextView publishTime; // "2016-01-28 23:00:00"
	public TextView wave; // "小浪轉大浪"
	public TextView validBeginTime; // "2016-12-25 18:00:00"
	public TextView waveLevel; // "1轉3公尺"
	public TextView windScale; // "4至5陣風7級明晨轉5至6陣風8級"
	public TextView validEndTime; // "2016-12-26 18:00:00"
	public TextView locationName; // "釣魚台海面"
	public TextView description; // "多雲時陰局部雨"
	public TextView wind; // "偏東風"
	public TextView id; // "1"

	public NearSeaViewHolder(View itemView) {
		super(itemView);
	}

}
