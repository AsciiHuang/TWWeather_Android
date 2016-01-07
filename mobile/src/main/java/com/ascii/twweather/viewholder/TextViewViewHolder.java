package com.ascii.twweather.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ascii.twweather.R;

public class TextViewViewHolder extends RecyclerView.ViewHolder {

	public TextView text;

	public TextViewViewHolder(View itemView) {
		super(itemView);
		text = (TextView) itemView.findViewById(R.id.text);
	}

}
