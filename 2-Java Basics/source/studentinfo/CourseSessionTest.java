package studentinfo;

import java.util.*;
import junit.framework.TestCase;
public class CourseSessionTest extends TestCase {

	private CourseSession courseSession;
	private Date startDate;

	public void setUp() {
		startDate = this.createDate(2017 , 3 , 6);
		courseSession = new CourseSession("ENG","001",startDate);
	}

	public void testCreate() {
		assertEquals("ENG",courseSession.getDepartment());
		assertEquals("001",courseSession.getNumber());
		assertEquals(0,courseSession.getNumberOfStudents());
		assertEquals(startDate,courseSession.getStartDate());
	}

	public void testEnrollStudents() {
		Student student1 = new Student("Cain DiVeo");
		courseSession.enroll(student1);

		assertEquals(1 , courseSession.getNumberOfStudents());
		assertEquals(student1 , courseSession.get(0));

		Student student2 = new Student("Coralee DeVaughn");
		courseSession.enroll(student2);

		assertEquals(2 , courseSession.getNumberOfStudents());
		assertEquals(student2 , courseSession.get(1));

		assertEquals(student1 , courseSession.get(0));
	}

	public void testCreateDate() {
		Date endDate = this.createDate(2017 , 6 , 26);
		assertEquals(endDate , courseSession.getEndDate());

	}

	private Date createDate(int year, int month , int day) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(Calendar.YEAR , year);
		calendar.set(Calendar.MONTH , month -1);
		calendar.set(Calendar.DAY_OF_MONTH , day);
		return calendar.getTime();
	}
}