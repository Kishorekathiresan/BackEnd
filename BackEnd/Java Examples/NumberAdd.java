import java.util.*;
class NumberAdd{
    public static void main(String args[]){
        int sum=0;
        for(String i:args){
            int num=Integer.parseInt(i);
            if(num!=-999){
                sum+=num;
            }
            else{
                break;
            }
        }
        System.out.println(sum);
    }
}