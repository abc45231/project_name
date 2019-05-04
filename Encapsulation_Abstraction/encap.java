package Encapsulation_Abstraction;

public class encap {
	
	private int n;
	private String name;

	public int getN() {
		return n*n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void m1() {
		System.out.println("m1 method:"+n);
	}
}
