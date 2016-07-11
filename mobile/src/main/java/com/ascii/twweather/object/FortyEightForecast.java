package com.ascii.twweather.object;

import java.util.ArrayList;

public class FortyEightForecast {

	public String locationName; // "台北市"
	public String weekLocation; // "Taipei"
	public String id; // "1"

	public ArrayList<Item> items; // size = 3

	public class Item {
		public String rain; // "40"
		public String beginTime; // "2016-01-29 00:00:00"
		public String title; // "今晚明晨"
		public String description; // "多雲時陰短暫陣雨"
		public String temperature; // "17 ~ 17"
		public String endTime; // "2016-01-29 06:00:00"
	}

}
