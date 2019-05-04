package Inheritance;

public class maruthi extends car {
	
	public maruthi() {
		 super("abc"); 
		System.out.println("this is constructor for maruthi");
	}
	
	static {
		System.out.println("maruthi static block");
	}
	
	public void start() {
		System.out.println("it is not auto start");
	}
	
	public void stop() {
		System.out.println("through button press we cannot stop maruthi");
	}
	
	public void repair() {
		System.out.println("it is very cheap and it has shops across India");
	}
	
	public void servicecenter() {
		System.out.println("i has servies across India and very cheap");
	}
	
	
	public void groundclearance()
	{
		System.out.println("it does not have ground clearance");
	}

}
