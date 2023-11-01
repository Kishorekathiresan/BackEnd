package kkk;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Values : ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==0)
					break;
				if(arr[i]==arr[j])
					arr[j]=0;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				System.out.println(arr[i]);
		}
	}

}
