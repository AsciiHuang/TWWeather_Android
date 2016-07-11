package com.ascii.twweather.object;

import java.util.ArrayList;

public class WeekForecast {

	public WeekForecast() {
	}

	public String locationName; // "台北市"
	public String publishTime; // "2016-01-28 23:00:00"
	public String id; // "1"

	public ArrayList<Item> items; // size = 14 or 15

	public class Item {
		public String temperature; // "17 ~ 17"
		public String date; // "2016-01-29"
		public String description; // "多雲時陰短暫陣雨"
		public String day; // "晚上"
	}
}
