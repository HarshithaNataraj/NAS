package basics.practice;

public class ConditionalStatements {

	public static void main(String[] args) {
		System.out.println("****Nested if****");
		 int age=5;
	        if(age>18) {
	        	if (age>59) {
	        		System.out.println("you're a senior citizen");
	        	}else {
	        	   System.out.println("You're an adult");
	        	}
	        	
	        }else if (age>12) {
	        	System.out.println("you're a teenager");
	        }else {
	        	System.out.println("you're  a child");

	        }

     }
}
