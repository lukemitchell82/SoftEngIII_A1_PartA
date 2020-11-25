// Luke Mitchell
// 17280041

// Import necessary libraries
import java.util.*;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Course {

	private String courseName;
	private ArrayList<String> listOfModules = new ArrayList<String>();
	private ArrayList<String> listOfStudents = new ArrayList<String>();
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
	
	
	// Accessor method for module name
	public ArrayList<String> getModuleList() {
		return listOfModules;
	}
	
	
	// Accessor method for list of students
	public ArrayList<String> getStudentList() {
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
}