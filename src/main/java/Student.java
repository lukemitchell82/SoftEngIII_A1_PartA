// Luke Mitchell
// 17280041

// Import necessary libraries
import java.util.*;

public class Student {
	private String name;
	private int age;
	private String dob;
	private int id;
	private String course;
	private List<String> modules = new ArrayList<String>();
	private String username;
	
	// Student constructor
	Student(String name, int age, String dob, int id, String course) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
		this.course = course;
	}
	
	// Username method thats creates a Username from a student's name and age
	public String getUsername() {
		username = (name + age);
		return username;
	}
	
	// Mutator and accessor methods for name of student
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// Mutator and accessor methods for age of student
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	// Mutator and accessor methods for a student's date of birth
	public void setDate(String dob) {
		this.dob = dob;
	}
	public String getDate() {
		return dob;
	}
	
	// Mutator and accessor methods for Student ID
	public void setID(int id) {
		this.id = id;
	}
	public int getID() {
		return id;
	}
	
	// Mutator and accessor methods for course of student
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	
	
	// Accessor method for modules a student is enrolled in
	public List<String> getModules() {
		return modules;
	}
}