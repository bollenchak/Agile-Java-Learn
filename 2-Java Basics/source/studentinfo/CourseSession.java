package studentinfo;

import java.util.*;

public class CourseSession {
	private String department; 
	private String number;
	private Date startDate;

	private ArrayList<Student> allStudents = new ArrayList<Student>();

	public CourseSession (String department , String number , Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}

	public String getDepartment() {
		return this.department;
	}

	public String getNumber() {
		return this.number;
	}

	public int getNumberOfStudents() {
		return this.allStudents.size();
	}

	public void enroll(Student student) {
		this.allStudents.add(student);
	}

	public Student get(int index) {
		return this.allStudents.get(index);
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public Date getEndDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(this.startDate);
		int daysInWeek = 7;
		int sessionLength = 16;
		calendar.add(Calendar.DAY_OF_YEAR , daysInWeek * sessionLength);
		return calendar.getTime();
	}
}