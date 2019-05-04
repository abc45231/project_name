package Errors_Exceptions;

public class Excp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int x=100,y=0;
		//Thread.sleep(3000);
		System.out.println("AAAAAAA");
		Thread.sleep(3000);
		System.out.println("BBBBBBB");
		Thread.sleep(3000);
		System.out.println("CCCCCCC");
		Thread.sleep(3000);
		
		try {
			System.out.println(x+y);
		}catch(ArithmeticException e){
			System.out.println("exception:"+e);
		}
		
		try {
			int i[] = new int[2];
			
			System.out.println(x/y);
			i[4]=20;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(x-y);
		}catch(ArithmeticException e) {
			System.out.println("exception:"+e);
		}
		
		try {
			System.out.println(x*y);
		}
		catch(ArithmeticException e) {
			System.out.println("exception:"+e);
		}
		
		

	}

}
