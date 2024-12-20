package Logical_Que.Dec_19;

import java.util.Scanner;

public class Display_ArrayElement_Scanner 
{
//	public static int[] createArray()   //METHOD-01
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter array size: ");
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		
//		System.out.print("Enter "+size+" elements in array: ");
//		for(int i=0; i<arr.length; i++)
//		{
//			arr[i] = sc.nextInt();
//		}
//		return arr;
//	}
//	
//	public static void printArray(int[] arr)
//	{
//		System.out.print("Array elements are: ");
//		for(int i=0; i<arr.length; i++)
//		{
//			System.out.print(arr[i]+ " ");
//		}
//		
//	}
	
	public static void main(String[] args) 
	{
//		int[] result = createArray();
//		printArray(result);
		
		Scanner sc = new Scanner(System.in);   //METHOD-02
		System.out.print("Enter Array Size: ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		System.out.print("\nEnter "+ size +" elements: ");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array "+ i +" index element are: "+ arr[i]);
		}
		sc.close();
	}
}
