
// Luke Mitchell
// 17280041

// Import necessary libraries
import java.util.*;

public class Module{
	
	private String moduleName;
	private String moduleID;
	private List<String> students = new ArrayList<>();
	private List<String> linkedCourses = new ArrayList<>();
	
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
	public void addStudent(String s) {
		students.add(s);
	}
	
	// Accessor method for students
	public List<String> getStudents() {
		
		return students;
	}
	
	
	// Adds a module's associated course to ArrayList 'linkedCourses'
	public void addLinkedCourses(String s) {
		linkedCourses.add(s);
	}
	
	// Accessor method for linked courses
	public List<String> getLinkedCourses() {
		return linkedCourses;
	}
}