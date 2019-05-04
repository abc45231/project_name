package Errors_Exceptions;
public class Excp2{
	static int x=10,y=2;
	final int z;
	Excp2(){
		z=10;
	}
	
	public static void main(String[] args){
		
		try {
			System.out.println(x/y);
		}catch(Exception e) {
			System.out.println(e);
			show();
		}finally {
			System.out.println("end of excp");
		}
	//diff between finally and final
		//final static int x=10; cant change it.x=20;
		//cannot overwrite the final method
		//u cant extend any final class

	}
	
	public static void show() {
		int a[]=new int[3];
		a[5]=x;
		System.out.println(a[1]);
	}

	public static void m1()  {
		
		System.out.println("CCCCCCCCCC");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
