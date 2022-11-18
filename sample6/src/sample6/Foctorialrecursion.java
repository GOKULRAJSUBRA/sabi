package sample6;

public class Foctorialrecursion {
	static int factorial(int number) {
		if(number==0)
			return 1;
		else
			return number*factorial(number-1);
		
	}

	public static void main(String[] args) {
		int fact;
		int number=5;
		fact=factorial(number);
		System.out.println("Factorial of "+number+" is "+fact);

	}

}
