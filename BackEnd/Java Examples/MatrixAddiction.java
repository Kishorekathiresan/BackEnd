import java.util.*;
class MatrixAddition{
    public static void main(String args[]){
        Scanner ma=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        System.out.println("enter the first matrix:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=ma.nextInt();
            }
        }
        System.out.println("enter the second matrix:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr1[i][j]=ma.nextInt();
            }
        }
        System.out.println("The output matrix:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr2[i][j]=arr[i][j]+arr1[i][j];
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}