public class CourseSession {
	private String department; 
	private String number;

	private int numberOfSudents = 0;
	private java.util.ArrayList<Student> allStudents = new java.util.ArrayList<Student>();

	public CourseSession (String department , String number) {
		this.department = department;
		this.number = number;
	}

	public String getDepartment() {
		return this.department;
	}

	public String getNumber() {
		return this.number;
	}

	public int getNumberOfStudents() {
		return this.numberOfSudents;
	}

	public void enroll(Student student) {
		this.numberOfSudents = numberOfSudents + 1;
		this.allStudents.add(student);
	}

	public java.util.ArrayList<Student> getAllStudents() {
		return this.allStudents;
	}
}