public class CourseSessionTest extends junit.framework.TestCase {
	public void testCreate() {
		CourseSession courseSession = new CourseSession("ENG","001");
		assertEquals("ENG",courseSession.getDepartment());
		assertEquals("001",courseSession.getNumber());

		assertEquals(0,courseSession.getNumberOfStudents());
	}

	public void testEnrollStudents() {
		CourseSession courseSession = new CourseSession("ENG" , "001");

		Student student1 = new Student("Cain DiVeo");
		courseSession.enroll(student1);

		assertEquals(1 , courseSession.getNumberOfStudents());

		java.util.ArrayList<Student> allStudents = courseSession.getAllStudents();
		assertEquals(1 , allStudents.size());
		assertEquals(student1 , allStudents.get(0));

		Student student2 = new Student("Coralee DeVaughn");
		courseSession.enroll(student2);

		assertEquals(2 , courseSession.getNumberOfStudents());
		assertEquals(2 , allStudents.size());
		assertEquals(student2 , allStudents.get(1));

	}
}