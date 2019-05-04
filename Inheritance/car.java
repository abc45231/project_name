package Inheritance;

public class car {

		public car (String s)
		{
			System.out.println("constructor of car"+s);
		}
		
		static {
			System.out.println("car static block");
		}
		
		public void start()
		{
			System.out.println("start the car with keys");
		}
		
		public void stop() {
			System.out.println("stop the car with keys");
		}
		
		public void sterring() {
			System.out.println("it has sterring");
		}
		
		public void repair() {
			System.out.println("there is service station");
		}

	

}
