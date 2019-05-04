package Inheritance;

public class fileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		file f=new file();
		word w=new word();
		w.open();
		w.edit();
		w.save();
		w.close();
		w.picures_attachment();
		w.word_usage();
		w.center_allignment();
		w.left_allignment();
		w.right_allignment();
		w.security();
		
		excel e=new excel();
		e.open();
		e.edit();
		e.save();
		e.close();
		e.excel_usage();
		e.format_cells();
		e.pie_presentation();
		e.graph_presentation();
		e.center_allignment();
		e.left_allignment();
		e.right_allignment();
		e.security();
		
		
		file f1=new word();
		f1.save();
		
		
		
		
		

	}

}
