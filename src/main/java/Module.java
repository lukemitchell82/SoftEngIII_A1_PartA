
// Luke Mitchell
// 17280041

// Import necessary libraries
import java.util.*;

public class Module{
	
	private String moduleName;
	private String moduleID;
	private List<Student> students = new ArrayList<>();
	private List<Course> linkedCourses = new ArrayList<>();
	
	// Module Constructor
	Module(String moduleName, String moduleID) {
		this.moduleName = moduleName;
		this.moduleID = moduleID;
	}
	
	// Mutator and accessor methods for module name
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleName() {
		return moduleName;
	}
	
	
	// Mutator and accessor methods for module ID
	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}

	public String getModuleID() {
		return moduleID;
	}
	
	
	// Adds students to Module's ArrayList 'students'
	public void addStudent(Student s) {
		students.add(s);
	}
	
	
	// Accessor method for students
	public List<Student> getStudents() {
		return students;
	}
	
	
	// Adds a module's associated course to ArrayList 'linkedCourses'
	public void addLinkedCourses(Course c) {
		linkedCourses.add(c);
	}
	
	// Accessor method for linked courses
	public List<Course> getLinkedCourses() {
		return linkedCourses;
	}
	
	public String toString() {
		return moduleName + ", " + moduleID + ", " + students + ", " + linkedCourses;
	}
}