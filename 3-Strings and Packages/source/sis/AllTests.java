package sis;

import junit.framework.TestSuite;
import sis.studentinfo.*;
import sis.report.*;

public class AllTests {

	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(sis.report.AllTests.suite());
		suite.addTest(sis.studentinfo.AllTests.suite());
		return suite;
	}
}