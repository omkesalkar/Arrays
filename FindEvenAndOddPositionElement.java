package Arrays_Logical_Questions.Day_02;

import java.util.Scanner;

public class FindEvenAndOddPositionElement 
{
	public static int[] createArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter "+ size +" elements in array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array element at index "+ i +" : "+ arr[i]);
		}
		sc.close();
		return arr;
	}
	
	public static void findEvenOddPositionIndex(int[] arr)
	{
		int evenIndex = arr[0], oddIndex = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			evenIndex = arr[0];
			oddIndex = arr[0];
			
			if(i % 2 == 0)
			{
				evenIndex++;
			}
			else if(i % 2 !=0 )
			{
				oddIndex++;
			}
		}
		System.out.println("Even index elements: "+ evenIndex);
		System.out.println("Odd index elements: "+ oddIndex);
	}
	public static void main(String[] args)
	{
		int[] arr1 = createArray();
		findEvenOddPositionIndex(arr1);
	}
}
