package Inheritance;

public class Alto extends maruthi {
	
	public Alto(){
		/* super("poc"); */
		System.out.println("this is alto constructor");
	}
	
	static {
		System.out.println("alto static block");
	}
	
	public void color()
	{	
		
		System.out.println("the red color alto is very nice than other colors");
	}
	public void start()
	{	
		
		System.out.println("auto start and also start with keys");
	}
	
	
	  public void repair() {
	  super.repair();
	  System.out.println("there is seperate service station for alto itself"); }
	 
	

}
