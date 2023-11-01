package kkk;
import java.util.*;
public class reverseint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int num1=num;
		int rev=0;
		if(num>1000 && num<10000) {
			 while(num>0){
	              int a=num%10;
	              rev=rev * 10 + a;
	              num=num/10;
	          }
         System.out.println(rev);

		if(rev==num1) {
			System.out.println("Given number is palindrome");
		}
		else {
			System.out.println("Given number is not palindrome");
		}
		}
		else {
			System.out.println("Invalid number");
		}
sc.close();

	}

}
