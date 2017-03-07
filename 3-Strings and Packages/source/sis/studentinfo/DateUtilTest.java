package sis.studentinfo;

import java.util.*;
import junit.framework.TestCase;

public class DateUtilTest extends TestCase {
	
	public void testCreateDate() {
		Date date = DateUtil.createDate(2017,3,7);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		assertEquals(2017 , calendar.get(Calendar.YEAR));
		assertEquals(Calendar.MARCH , calendar.get(Calendar.MONTH));
		assertEquals(7 , calendar.get(Calendar.DAY_OF_MONTH));
	}
}