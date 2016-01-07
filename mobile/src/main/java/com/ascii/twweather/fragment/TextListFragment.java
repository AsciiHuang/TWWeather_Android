package com.ascii.twweather.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ascii.twweather.R;
import com.ascii.twweather.adapter.TextListAdapter;

import java.util.ArrayList;

public class TextListFragment extends Fragment {

	private RecyclerView recyclerView;
	private RecyclerView.Adapter recyclerAdapter;
	private ArrayList<String> items;

	public static TextListFragment newInstance() {
		TextListFragment fragment = new TextListFragment();
		return fragment;
	}

	public TextListFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_textlist, container, false);
		recyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);
		recyclerView.setHasFixedSize(true);
		recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

		// init Items
		items = new ArrayList<>();
		items.add("aaa");
		items.add("bbb");
		items.add("ccc");
		items.add("ddd");
		items.add("eee");
		items.add("fff");
		items.add("ggg");
		items.add("hhh");
		items.add("iii");
		items.add("jjj");

		recyclerAdapter = new TextListAdapter(items);
		recyclerView.setAdapter(recyclerAdapter);



		return view;
	}
}
