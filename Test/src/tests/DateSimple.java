package tests;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSimple {

	public static void main(String[] args) {
		
		String pattern = "MM-dd-yyy";
		SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
		String date = dateformat.format(new Date());
		System.out.println(date);
	}
}
