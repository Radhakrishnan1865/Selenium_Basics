package practice;

public class ClassA {

	public static void main(String[] args) {


		String s= "i am human being";
		String []a=s.split(" ");
		
		//String rev="";
		
			String reverse="";
			for(int i=s.length()-1; i>=0; i--) {
				
				reverse=reverse+s.charAt(i);
			
		}
		System.out.println(reverse);
		
	}

}
