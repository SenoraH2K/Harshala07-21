package org.iit.mmp.lib;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utility {

	public static String generateFutureDate(int n,String format )
	{
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, n);
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String formattedDate = sdf.format(d);
		System.out.println("Formatted Date:::" + formattedDate);
		String dateArr[] = formattedDate.split("/");
		System.out.println(dateArr[0]);
		System.out.println(dateArr[1]);
		System.out.println(dateArr[2]);
		return formattedDate;
	}
}
