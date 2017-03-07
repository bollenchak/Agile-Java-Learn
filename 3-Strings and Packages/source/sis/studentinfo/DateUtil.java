package sis.studentinfo;

import java.util.*;

public class DateUtil {

	public static Date createDate(int year , int month , int day) {
		Calendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(Calendar.YEAR , year);
		calendar.set(Calendar.MONTH , month -1);
		calendar.set(Calendar.DAY_OF_MONTH , day);
		return calendar.getTime();
	}
}