package Logical_Que.Dec_19;

import java.util.Scanner;

public class Display_ArrayReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.print("Enter "+ size +" elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array "+i+" index element value are: "+ arr[i]);
		}
		
		int length = arr.length;
		System.out.print("Reverse array: " );
		for(int i=1; i<=arr.length; i++)
		{
			System.out.print(arr[length - i]+" ");
		}
		sc.close();
	}
}
