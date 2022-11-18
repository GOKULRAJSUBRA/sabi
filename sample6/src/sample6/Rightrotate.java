package sample6;

import java.util.Scanner;

public class Rightrotate {

	public static void main(String[] args) {
		int []input=new int[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		for(int i=0;i<input.length;i++) {
		input[i]=sc.nextInt();
		}
		System.out.println("enter the rotation of element");
		int no=sc.nextInt();
		for(int k=0;k<no;k++) {
			int first=input[0];
		for(int i=0;i<input.length-1;i++) {
			input[i]=input[i+1];
		}
		input[input.length-1]=first;
		}
		System.out.println("after rotation ");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		

	}

}
