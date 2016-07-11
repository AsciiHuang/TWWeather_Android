package com.ascii.twweather.utils;

public class AppUtils {

	public String getImageByWeatherDescription(String description, String title)
	{
		if (description == null || "".equals(description))
		{
			return "non";
		}
		else
		{
			String strRes = "";

			if (title.indexOf("白") < 0)
			{
				// 找不到白，代表不是白天 :P
				strRes = "night_";
			}
			else
			{
				strRes = "day_";
			}

			return getImageNameByDescription(description, strRes);
		}
	}

	public String getImageNameByDescription(String description, String prefix) {
		String strRes = prefix;

		String strSub = "";
		if (description.indexOf("晴") >= 0)
		{
			strSub += "S";
		}

		if (description.indexOf("雲") >= 0)
		{
			strSub += "C";
		}
		else if (description.indexOf("陰") >= 0)
		{
			// 雲和陰都是 C 所以在確沒有雲的情況下才檢查陰
			strSub += "C";
		}

		if (description.indexOf("雨") >= 0)
		{
			strSub += "R";
		}

		if (description.indexOf("雷") >= 0)
		{
			strSub += "T";
		}

		if ("".equals(strSub))
		{
			// 找不到對應的天氣
			strRes = "non";
		}

		return strRes;

	}

	public int getImageResourceIdByName(String name) {

	}

}
