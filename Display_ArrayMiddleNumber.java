package Logical_Que.Dec_19;

import java.util.Scanner;

public class Display_ArrayMiddleNumber 
{
	public static int[] createArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter "+ size +" elements in an array: ");
		for(int i=0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array element "+ i +" index value: "+ arr[i]);
		}
		sc.close();
		return arr;
	}
	
	public static void findMiddle(int[] arr)
	{
		int length = arr.length;

		if (length % 2 == 0) // even number array operation
		{
			int middle1 = arr[(length / 2) - 1];
			int middle2 = arr[length / 2];
			System.out.print("\nMiddle elements of even array values: " + middle1 + ", " + middle2);
		} 
		else 
		{
			int middle2 = arr[length / 2];
			System.out.print("\nMiddle element of odd array values: " + middle2);
		}
	}
	
	public static void main(String[] args) 
	{
		int[] result = createArray();
		findMiddle(result);
		
	}
}
