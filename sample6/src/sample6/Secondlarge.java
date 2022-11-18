package sample6;

import java.util.Arrays;

public class Secondlarge {

	public static void main(String[] args) {
		int []a= {22,12,45,14,18};
		int l=a.length;
		int max=0;
		
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
			if(a[i]>a[j]) {
				max=a[i];
				a[i]=a[j];
				a[j]=max;
			}
		}}
		for(int i=0;i<l;i++) {
		System.out.print("\t"+a[i]);
		}
		System.out.println();
		System.out.println("second largest number in array\t"+a[l-2]);

	}

}
