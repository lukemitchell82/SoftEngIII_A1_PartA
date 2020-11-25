// Luke Mitchell
// 17280041

// Import necessary libraries
import java.util.*;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Course {

	private String courseName;
	private ArrayList<Module> listOfModules = new ArrayList<>();
	private ArrayList<Student> listOfStudents = new ArrayList<>();
	DateTime acadStartDate = new  DateTime();
	DateTime acadEndDate = new DateTime();
	
	// Course constructor
	Course (String courseName, String startDate, String endDate) {
		this.courseName = courseName;
		
		// Converts a String into a DateTime using DateTimeFormatter
		DateTimeFormatter startDateFormat = DateTimeFormat.forPattern("dd/MM/yyyy");
		acadStartDate = startDateFormat.parseDateTime(startDate);
		
		DateTimeFormatter endDateFormat = DateTimeFormat.forPattern("dd/MM/yyyy");
		acadEndDate = endDateFormat.parseDateTime(endDate);
	}
	
	
	// Mutator and accessor methods for course name
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	
	// Adds modules to modules ArrayList
	public void addToModuleList(Module m) {
		listOfModules.add(m);
	}
	
	// Accessor method for list of modules
	public ArrayList<Module> getModuleList() {
		return listOfModules;
	}
	
	
	// Adds students to students ArrayList
	public void addToStudentList(Student s) {
		listOfStudents.add(s);
	}
	
	// Accessor method for list of students
	public List<Student> getStudentList() {
		return listOfStudents;
	}
	
	
	// Mutator and accessor methods for academic start date
	public void setStartDate(String startDate) {
		DateTimeFormatter startDateFormat = DateTimeFormat.forPattern("dd/MM/yyyy");
		acadStartDate = startDateFormat.parseDateTime(startDate);
	}
	
	public DateTime getStartDate() {
		return acadStartDate;
	}

	
	// Mutator and accessor methods for academic end date
	public void setEndDate(String endDate) {
		DateTimeFormatter endDateFormat = DateTimeFormat.forPattern("dd/MM/yyyy");
		acadEndDate = endDateFormat.parseDateTime(endDate);
	}
	
	public DateTime getEndDate() {
		return acadEndDate;
	}
	
	
	public String toString() {
		return courseName + ", " + listOfModules + ", " + listOfStudents + ", " + acadStartDate + ", " + acadEndDate;
	}
}