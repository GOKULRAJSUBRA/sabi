package sample6;

public class Factorialexample {

	public static void main(String[] args) {
		int fact=1;
		int input=5;
		for(int i=1;i<=input;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+input+" is "+fact);

	}

}
