import java.util.*;
class NumberWord{
    public static void main(String args[]){
        Scanner nw=new Scanner(System.in);
        int num=nw.nextInt();
        int num1,n,reversed=0;
        boolean zerocount=true;
        while(num!=0){
            num1=num%10;
            reversed=reversed*10 + num1;
            num=num/10;
        }
        while(reversed!=0){
            n=reversed%10;
            switch(n){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("One");break;
                case 2:
                    System.out.println("Two");break;
                case 3:
                    System.out.println("Three");break;
                case 4:
                    System.out.println("Four");break;
                case 5:
                    System.out.println("Five");break;
                case 6:
                    System.out.println("Six");break;
                case 7:
                    System.out.println("Seven");break;
                case 8:
                    System.out.println("Eight");break;
                case 9:
                    System.out.println("Nine");break;
            }
            reversed=reversed/10;
        }
    }
}