package com.concepts.HackerRank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
	
	static String timeConversion(String s) {
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ssa");
        try {
			Date d = format.parse(s);
	        SimpleDateFormat format1 = new SimpleDateFormat("HH:mm:ss");
	        return format1.format(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
 
    }
	
	public static void main(String[] args) {
		System.out.println(timeConversion("07:05:45PM"));
	}

}
