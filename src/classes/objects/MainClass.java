package classes.objects;

public class MainClass {

	String name = "Bharath Reddy";

	 int empId = 12345;

	boolean visaStatus = false;
	
	static int age = 34;

	public static void main(String[] args) {

		MainClass obj = new MainClass();// Creating Object

		System.out.println("Emp Name is :" + obj.name);

		System.out.println("Emp Id is :" + obj.empId);

		System.out.println("Emp Visa Status is :" + obj.visaStatus);
		
		System.out.println(age);

	}

}
