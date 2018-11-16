package com.actions.demo;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderDemo {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = new GregorianCalendar();
		int year= calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH);
		int date=calendar.get(Calendar.DATE);
		int day_of_month= calendar.get(Calendar.DAY_OF_MONTH);
		int day_of_week= calendar.get(Calendar.DAY_OF_WEEK);		
		int week_of_Month= calendar.get(Calendar.WEEK_OF_MONTH);
		
		System.out.println(year +"  "+ month +"  "+date+"  "+day_of_month +"  "+ day_of_week +"  "+ week_of_Month );
		

	}

}
