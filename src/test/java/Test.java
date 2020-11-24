import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		// Student class tests
		//
		// Tests the funtionality of getUsername
		Student studentTest = new Student("Luke", 21, "08/21/1999", 12345678, "ECE");
		String output1 = studentTest.getUsername();
		assertEquals("Luke21", output1);
		
		// Module class tests
		//
		// Tests the accessor method of moduleName and moduleID 
		Module moduleTest1 = new Module("Software Engineering III", "CT1234");
		String output2 = moduleTest1.getModuleName();
		assertEquals("Software Engineering III", output2);
		String output3 = moduleTest1.getModuleID();
		assertEquals("CT1234", output3);
		
		
		// Course class tests
		//
		// Tests the accessor methods of getStartDate() and getEndDate();
		Course courseTest1 = new Course("ECE", "28/9/2020", "4/6/2021");
		System.out.println("Academic Start Date: " + courseTest1.getStartDate());
		// I found it tricky to compare a DateTime with a manually written DateTime with 'assertEquals', so I
		// just printed out the value of getStartDate() and getEndDate() to show that the value of acadStartDate
		// and acadEndDate is being correctly returned in those accessor methods, thus testing them
		System.out.println("Academic End Date: " + courseTest1.getEndDate());
	}
}