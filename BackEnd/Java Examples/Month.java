import java.util.*;
class Month{
    public static void main(String args[]){
        int num=Integer.parseInt(args[0]);
        switch(num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febrary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}