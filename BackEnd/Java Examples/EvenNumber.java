import java.util.*;
class EvenNumber{
    public static void main(String args[]){
        int n=Integer.parseInt(args[0]);
        if(n>1){
            System.out.println("Invalid number");
            }
        }
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}