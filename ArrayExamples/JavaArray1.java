package ArrayExamples;

public class JavaArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x1=10,x2=23,x3=40,x4=90;
		int x[]= {10,20,30,40,50,89};
		int sum=0;
		int sub=0;
		System.out.println(x.length);
		//System.out.println(x[10]);
		
		for (int i=0;i<x.length;i++) {
			//System.out.println(x[i]);
			sum=sum+x[i];
			
		}
		
		
		System.out.println(sum);
		System.out.println(x.length-1);

		for (int i=1;i<=(x.length-1);i++) {
			sub=x[i]-x[i-1];
			System.out.println(sub);
		}
		
		System.out.println("----------------------");
		String s[]= {"java","webdriver","testng","again"};
		System.out.println(s.length);
		for (int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("======================");
		char c[]= {'a','b','c'};
		System.out.println(c.length);
		for (int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("======================");
		boolean b[]= {true,false,true,true,false};
		System.out.println(b.length);
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("======================");
		double d[]= {2.3,5.2,5,7,78};
		System.out.println(d.length);
		for (int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		

	}

}
