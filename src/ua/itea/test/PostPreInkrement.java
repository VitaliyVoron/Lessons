package ua.itea.test;

public class PostPreInkrement {

	public static void main(String[] args) {
		
		int i = 5; 
		i = i++ + i++; 
		System.out.println(i); 
		
		i = 5; 
		i = i++ + ++i; 
		System.out.println(i); 
		
		i = 5; 
		i = ++i + ++i; 
		System.out.println(i); 
		
		boolean tricky =	( 3 >= 3 && !(true || true) );
		System.out.println(tricky);
		
		i = 5;
		i++;
		System.out.println(i);

	}

}
