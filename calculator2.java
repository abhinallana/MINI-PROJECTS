import java.util.Scanner;

public class calculator2 {

	public static void main(String[] args) {
		System.out.println("--------CALCULATOR--------");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		double a = sc.nextDouble();
		System.out.println("enter a number:");
		double b = sc.nextDouble();
		System.out.println("symbol:");
	    char s = sc.next().charAt(0);
	    if(s=='+') {
	    	double add = addition(a,b);
	    	System.out.println(add);
	    }else if(s == '-')
	    {
	    	double sub = subtraction(a,b);
	    	System.out.println(sub);
	    }else if (s == '*') {
	    	double mul = multiplication(a,b);
	    	System.out.println(mul);
	    }else if(s == '/') {
	    	double div = division(a,b);
	    	System.out.println(div);
	    }else {
	    	System.out.println("Error");
	    }
	
		
	    
	}
	    static double addition(double a ,double b) {
	    	double result = a + b;
	    	return result;
	    	}
	    static double subtraction(double a , double b) {
	    	double result = a-b;
	    	return result;
	    }
	    static double multiplication(double a ,double b) {
	    	double result = a*b;
	    			return result;
	    }
	    static double division(double a , double b) {
	    	double result = a/b;
	    	return result;
	    }
	}


