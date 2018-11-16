package com.actions.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {

		// Date date = new Date();
		// String datevalue = date.toString();
		// System.out.println(datevalue);
		//
		// SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a
		// zzz");
		// String formatedDate= sdf.format(date);
		// System.out.println(formatedDate);

		String time1 = "16:00:00";
		String time2 = "19:00:00";

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date date1 = sdf.parse(time1);
		Date date2 = sdf.parse(time2);

		Long diff = date2.getTime() - date1.getTime();
		System.out.println(diff);
		// --> o/p in format 3*60*60*1000 = 10,800,000

		int comparison = date1.compareTo(date2);
		System.out.println(comparison);
		// 0 = same date
		// 1 = future date
		// -1 = back date

	}

}
