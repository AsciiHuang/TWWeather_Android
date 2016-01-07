package com.ascii.twweather.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ascii.twweather.R;
import com.ascii.twweather.viewholder.TextViewViewHolder;

import java.util.ArrayList;

public class TextListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

	ArrayList<String> items;

	public TextListAdapter(ArrayList<String> items) {
		this.items = items;
	}

	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_singleline_text_item, parent, false);
		TextViewViewHolder viewHolder = new TextViewViewHolder(view);
		return viewHolder;
	}

	@Override
	public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
		TextViewViewHolder textViewViewHolder = (TextViewViewHolder) holder;
		textViewViewHolder.text.setText(items.get(position));
	}

	@Override
	public int getItemCount() {
		return items.size();
	}

}
