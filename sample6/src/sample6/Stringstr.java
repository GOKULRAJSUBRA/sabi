package sample6;

public class Stringstr {

	public static void main(String[] args) {
	 String s="bessybessy";
	 char temp;
	 char[] arr=s.toCharArray();
	 for(int i=0;i<arr.length;i++) {
		 for(int j=i+1;j<arr.length;j++) {
			 if( arr[i]> arr[j])
			 {
				 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
	    
		 }
		
	}
	 System.out.println(arr);
	}
}
