package kkk;
import java.util.*;
public class MenuDetails {

	public static void main(String[] args) {
		Menu[] myMenu=new Menu[5];
		Scanner sc=new Scanner(System.in);
		String dishName;
		float calories,price,bottle;
		int time;
		for(int i=0;i<5;i++) {
			System.out.println("Enter the menu name");
			dishName=sc.nextLine();
			System.out.println("Enter the Calories of the menu");
			calories=sc.nextFloat();
			System.out.println("Enter the cooking time");
			time=sc.nextInt();
			System.out.println("Enter the no of wine bottle");
			bottle=sc.nextFloat();
			System.out.println("Enter the price of the menu");
			price=sc.nextFloat();
			
			
		}
	}

}
