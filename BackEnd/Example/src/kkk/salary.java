package kkk;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary_amount;
		float hra,da,gross_salary = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary amount:");
		salary_amount=sc.nextInt();
		if(salary_amount>=1 && salary_amount<=4000) {
			hra=(salary_amount/100)*10;
			da=(salary_amount/100)*50;
			gross_salary=salary_amount+hra+da;
		}
	    if(salary_amount>=4001 && salary_amount<=8000) {
			hra=(salary_amount/100)*20;
			da=(salary_amount/100)*60;
			gross_salary=salary_amount+hra+da;
		}
	    if(salary_amount>=8001 && salary_amount<=12000) {
			hra=(salary_amount/100)*25;
			da=(salary_amount/100)*70;
			gross_salary=salary_amount+hra+da;
		}
	    if(salary_amount>=12000) {
	    	hra=(salary_amount/100)*30;
			da=(salary_amount/100)*80;
			gross_salary=salary_amount+hra+da;
	    }
	    System.out.println("The gross salary is :"+ gross_salary);
	    sc.close();
	}

}
