package ArrayExamples;

public class JavaArray2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[][]=new String[2][3];//2 rows and 3 columns
		System.out.println(s.length);//this will print the no fo rows
		System.out.println("cols:"+s[1].length);//now it will print the no of columns
		s[0][0]="A1";
		s[0][1]="b1";
		s[0][2]="b1";
		
		s[1][0]="A1";
		s[1][1]="b1";
		s[1][2]="b1";
		
		for(int r=0;r<s.length;r++) {
			for(int c=0;c<s[r].length;c++) {
				System.out.print(s[r][c] + " ");
			}
			System.out.println("");
		}
			
		
	
		
	}

}
