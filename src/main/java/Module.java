
// Luke Mitchell
// 17280041

// Import necessary libraries
import java.util.*;

public class Module{
	
	private String moduleName;
	private String moduleID;
	private List<String> students = new ArrayList<String>();
	private List<String> linkedCourses = new ArrayList<String>();
	
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
	
	
	// Accessor method for students
	public List<String> getStudents() {
		return students;
	}
	
	
	// Accessor method for linked courses
	public List<String> getLinkedCourses() {
		return linkedCourses;
	}
}