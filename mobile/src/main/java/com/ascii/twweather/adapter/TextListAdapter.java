package com.ascii.twweather.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ascii.twweather.R;
import com.ascii.twweather.viewholder.TextViewViewHolder;

import java.util.ArrayList;

public class TextListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

//	說一下，大家如果在 RecyclerView 要對 item 加上 click listener 時，建議在 onCreateViewHolder 做，不要放在 onBindViewHolder，避免 new 太多 listener，在 scroll 時會不斷需要回收造成效能問題，詳細可以參考
//	http://stackoverflow.com/questions/24885223/why-doesnt-recyclerview-have-onitemclicklistener-and-how-recyclerview-is-dif?answertab=votes#tab-top

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
