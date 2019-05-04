package Inheritance;

public class BMW extends car {

public BMW() {
	super("abc");
	System.out.println("BMW constructor");
}

static {
	System.out.println("bmw static block");
}

public void safety()
{
	System.out.println("BMW has safety feature");
}

public void start()
{
	System.out.println("bmw has auto start feature");
	
}

public void sterring() {
	
	System.out.println("it is power sterring");
}

}
