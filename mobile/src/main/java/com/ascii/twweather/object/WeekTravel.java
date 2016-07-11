package com.ascii.twweather.object;

import java.util.ArrayList;

public class WeekTravel {

	public String locationName; // "陽明山"
	public String publishTime; // "2016-01-28 23:00:00"
	public String id; // "1"

	public ArrayList<Item> items; // size = 7

	public class Item {
		public String temperature; // "17 ~ 17"
		public String date; // "2016-01-29"
		public String description; // "多雲時陰短暫陣雨"
	}

}
