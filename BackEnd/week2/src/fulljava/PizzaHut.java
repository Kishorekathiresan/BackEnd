package fulljava;

import java.util.*;
public class PizzaHut {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           
        CustomerReport customerReport = new CustomerReport(3);
        //with parameterized
        for(int cust_count=0;cust_count<3;cust_count++)
        {
           
            System.out.println("Enter the Customer Name : ");
            String cust_Name=sc.nextLine();
            System.out.println("Enter the Customer Address :");
            String cust_Address=sc.nextLine();
           
           
            Customer customer=new Customer(cust_Name,cust_Address);
            Customer.printBillNo();
            System.out.print("\tDate:"+new Date());
            customer.display();
            customerReport.addCustomer(customer);
        }
        System.out.println("\n Customer Report : ");
        customerReport.printList();
       
         while (true) {
                System.out.println("Choose an option:\n1. Italian Pizza\n2. Mexican Pizza");
                int choice = sc.nextInt();
 
                System.out.print("Enter pizza name: ");
                sc.nextLine(); // Consume the newline character
                String name = sc.nextLine();
 
                System.out.print("Enter type (veg or non-veg): ");
                String type = sc.nextLine();
 
                System.out.print("Enter toppings (comma-separated): ");
                String[] toppings = sc.nextLine().split(", ");
 
                System.out.print("Enter time for preparation (in minutes): ");
                float timeForPreparation = sc.nextFloat();
 
                Pizza pizza=null;
 
                if (choice == 1) {
                    pizza = new ItalianPizza(type, toppings, name, timeForPreparation);
                } else {
                    pizza = new MexicanPizza(type, toppings, name, timeForPreparation);
                }
 
                System.out.println(pizza.toString());
            }
       
 
    }
 
}