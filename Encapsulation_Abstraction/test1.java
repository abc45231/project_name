package Encapsulation_Abstraction;

public class test1 {
	
	public static void main(String[] args) {
	encap e1=new encap();
	//e1.n=10;
	//e1.m1();
	e1.setN(8);
	e1.m1();
	e1.setName("kannan");
	System.out.println(e1.getName());
	System.out.println(e1.getN());
	}

}
