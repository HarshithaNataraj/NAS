package basics.practice;

import java.lang.runtime.SwitchBootstraps;

public class DataTypes {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println("c");
 
		
		System.out.println(5 & 6);
		System.out.println(5 | 6);
		System.out.println(5 ^ 6);
		System.out.println(~5);
		
        System.out.println(654>>5);
        System.out.println(5<<2);
        System.out.println(5<<2);
      	System.out.println(654<<5);
      	
        System.out.println("****Ternary operators****");
        int m = 14;
        int n = 6;
        System.out.println((m>n)?m:n);
        
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
        
        int day =3;
        switch (day) {
        case 1:
        	System.out.println("today is sunday");
        	break;
        	
        case 2:
        	System.out.println("today is monday");
        	break;
        	
        case 3:
        	System.out.println("today is tuesday");
        	break;
        	
        case 4:
        	System.out.println("today is wednesday");
        	break;
        	
        case 5:
        	System.out.println("today is thursday");
        	break;
        	
        case 6:
        	System.out.println("today is friday");
        	break;
        	
        case 7:
        	System.out.println("today is saturday");
        	break;
        	
        default:
        	System.out.println("please enter a valid number");
        	break;
        	
        	
       
        
        		
        		
        }
        
        
        	
        		
        	}
        		
        	
        
        	
	

          
       
    }
	


