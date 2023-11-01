import java.util.*;
class SumArray{
    public static void main(String args[]){
        int add=0;
        for(String i:args){
            int n=Integer.parseInt(i);
            add += n;
        }
        System.out.println(add);
        double average=add/(args.length);
        System.out.println(average);
        int count=0;
        for(int j=0;j<args.length;j++){
            if(Integer.parseInt(args[j])<average){
                count++;
            }
        }
        System.out.println(count);
    }
}