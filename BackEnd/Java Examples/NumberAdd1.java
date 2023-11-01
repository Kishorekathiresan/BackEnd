import java.util.*;
class NumberAdd1{
    public static void main(String args[]){
        int sum=0;
        boolean flag=true;
        while(flag){
        Scanner na=new Scanner(System.in);
        int num=na.nextInt();
        if(num!=-999){
                sum+=num;
            }
            else{
                flag=false;
            }}
            System.out.println(sum);
    }
}