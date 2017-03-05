public class StudentTest extends junit.framework.TestCase {

	public void testCreate() {
		final String firstStudentName = "bollen";
		Student student = new Student(firstStudentName);
		assertEquals(firstStudentName,student.getName());

		final String secondStudentName = "seven";
		Student secondStudent = new Student(secondStudentName);
		assertEquals("seven",secondStudent.getName());

		assertEquals(firstStudentName,student.getName());
	}
}