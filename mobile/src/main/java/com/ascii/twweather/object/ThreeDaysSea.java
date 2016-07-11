package com.ascii.twweather.object;

import java.util.ArrayList;

public class ThreeDaysSea {

	public String locationName; // "黃海南部海面"
	public String publishTime; // "2016-01-28 23:00:00"
	public String id; // "1"

	public ArrayList<Item> items; // size = 3

	public class Item {
		public String wave; // "大浪轉小浪"
		public String date; // "2016-01-29"
		public String description; // "多雲時陰短暫陣雨"
		public String wind; // "偏北轉東北風"
		public String windScale; // "5至6陣風8級下午轉4至5陣風7級"
	}

}
