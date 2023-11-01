package week2;


import java.util.*;

public class arraylist {

 

	public static void main(String[] args) {

		 studentArray stu = new studentArray();

 

	        stu.setNames();

	        stu.searchName("Yogesh");

	        stu.searchName(1);

	        System.out.println("Student names:");

	        stu.printNames();

	        stu.removeName("Kishore");

	        System.out.println("Updated Student names:");

	        stu.printNames();

 

	}

 

}

