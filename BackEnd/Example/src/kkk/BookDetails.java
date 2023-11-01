package kkk;
//import java.util.*;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Book myBook=new Book(100,"learn","kk",90000);
//           Scanner sc=new Scanner(System.in);
//           
//           System.out.println("Enter the book no:");
//           myBook.setBookNo(sc.nextInt());
//           sc.nextLine();
//           System.out.println("Enter the Title:");
//           myBook.setTitle(sc.nextLine());
//           System.out.println("Enter the Author:");
//           myBook.setAuthor(sc.nextLine());
//           System.out.println("Enter the price:");
//           myBook.setPrice(sc.nextFloat());
           
           System.out.println(myBook.getBookNo()+" "+myBook.getTitle()+" "+
                                  myBook.getAuthor()+" "+myBook.getPrice());
          // sc.close();
           
	}

}
