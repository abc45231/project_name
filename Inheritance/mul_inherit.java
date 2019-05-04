package Inheritance;

public class mul_inherit {
	
	public static void main(String[] args) {
		
		file f = new file();
		word w2 = new word();
		notepad n = new notepad();
		
		word w1 = new notepad();
		
		file f4 = new word();
		file f5 = new notepad();
		
		w2.center_allignment();
		w2.close();
		w2.open();
		w2.edit();
		w2.picures_attachment();
		w2.right_allignment();
		w2.save();
		w2.security();
		w2.word_usage();
		w2.left_allignment();
		
		n.center_allignment();
		n.close();
		n.edit();
		n.open();
		n.picures_attachment();
		n.right_allignment();
		n.save();
		n.security();
		n.word_usage();
		n.left_allignment();
		
	}
	
	
	
	

}
