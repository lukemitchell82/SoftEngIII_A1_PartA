
public class MainForTesting {

	public static void main(String[] args) {
		
		Student john = new Student("John", 20, "12/8/2000", 12343211, "ECE");
		
		Module digitalSystems = new Module("Digital Systems", "CT8278");

		john.addModule(digitalSystems.getModuleName());
		
		System.out.println(john.getModules());
	}

}
