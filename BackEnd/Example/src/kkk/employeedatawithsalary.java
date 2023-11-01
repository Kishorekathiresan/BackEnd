package kkk;

import java.util.Scanner;

public class employeedatawithsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        employeedata[] employees = new employeedata[2];
        for (int i = 0; i < 2; i++)
        {
            System.out.println("details of  Employee " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Basic Salary: ");
            float basic = sc.nextFloat();
            System.out.print("HRA: ");
            float hra = sc.nextFloat();
            System.out.print("DA: ");
            float da = sc.nextFloat();
            System.out.print("Special Allowance : ");
            float specialAllowance = sc.nextFloat();
            employees[i] = new employeedata(name, age, basic, hra, da, specialAllowance);
            sc.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("\nEmployee " + (i + 1) + " Details:");
            employees[i].displayDetails();
        }
sc.close();
	}

}
