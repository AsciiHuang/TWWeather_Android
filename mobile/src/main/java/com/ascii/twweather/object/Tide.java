package com.ascii.twweather.object;

import java.util.ArrayList;

public class Tide {

	public String locationName; // "釣魚台海面"
	public String id; // "1"

	public ArrayList<Item> items; // size = 3

	public class Item {
		public String date; // "2012-12-26"
		public String lunarDate; // "農曆11月14日"

		public Detail highDetail;
		public Detail lowDetail;
		public ArrayList<Detail> details; // size = 4~7
	}

	public class Detail {
		public String shortTime; // "02:14"
		public String longTime; // "2012-12-26 02:14:00"
		public String name; // "乾潮"
		public String height; // "-56.5"
	}

}
