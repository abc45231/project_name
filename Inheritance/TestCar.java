package Inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("--------------------------------");
		System.out.println("constructor calling time");
		System.out.println("--------------------------------");
		car c=new car("bca");
		System.out.println("--------------------------------");
		maruthi m=new maruthi();
		System.out.println("--------------------------------");
		Alto a=new Alto();
		System.out.println("--------------------------------");
		car ca=new Alto();
		System.out.println("--------------------------------");
		car cm=new maruthi();
		System.out.println("---------------------------------");
		System.out.println("repair time");
		System.out.println("--------------------------------");
		ca.repair();
		cm.repair();
		c.repair();
		a.repair();
		System.out.println("---------------------------------");
		System.out.println(" start time");
		System.out.println("---------------------------------");
		ca.start();
		cm.start();
		c.start();
		a.start();
		
		

	}

}
