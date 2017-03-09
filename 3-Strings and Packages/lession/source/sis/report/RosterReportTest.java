package sis.report;

import java.util.*;
import junit.framework.TestCase;
import sis.studentinfo.*;

public class RosterReportTest extends TestCase{
	private CourseSession courseSession;
	private Date startDate;

	public void setUp() {
		startDate = DateUtil.createDate(2017 , 3 , 6);
		courseSession = new CourseSession("ENG","001",startDate);
	}

	public void testRosterReport() {
		courseSession.enroll(new Student("A"));
		courseSession.enroll(new Student("B"));

		String rosterReport = new RosterReport(courseSession).getRosterReport();
//临时代码排版与左边缘对齐，提醒自己这段代码只是用来定位或者临时用途，一旦观察完输出，恢复代码
System.out.println(rosterReport);
		assertEquals(RosterReport.ROSTER_REPORT_HEADER + 
			"A" + RosterReport.NEWLINE +
			"B" + RosterReport.NEWLINE +
			RosterReport.ROSTER_REPORT_FOOTER + "2" + RosterReport.NEWLINE , rosterReport);
	}


}