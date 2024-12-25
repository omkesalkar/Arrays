package Arrays_Logical_Questions.Day_03_ArrayBInarySearch;

/* Implement a Java program to find the index number of an element 
   in an int array from a given range by using binary searching and 
   display the results.
 
   int[] nums = {3,4,5,6,7,8,12,13};
   Enter the starting index : 3
   Enter the ending index : 6
   Enter the element: 7
 
   Output:
   7 present at 4 index.*/

import java.util.Scanner;

public class FindArrayIndexNoByRange 
{
	public static int searchElement(int[] arr, int start, int end, int target)
	{
		for(int i=start; i<end; i++) 
		{
			if(target == arr[i])   //check target is in the range or not.
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {3,4,5,6,7,8,12,13};
		
		System.out.print("Arrays element is: ");
		for(int i=0; i<arr.length; i++) 
		{
			System.out.print(arr[i]+ " ");    //Print array elements
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting index: ");     //set starting index
		int startIndex = sc.nextInt();
		System.out.print("Enter the ending index: ");       //set ending index
		int endIndex = sc.nextInt();
		System.out.print("Enter element to search: ");      //enter element to check in array
		int ele = sc.nextInt();
		
		int index = searchElement(arr, startIndex, endIndex, ele);
		if(index != -1)
		{
			System.out.println("\nElement "+ ele +" found in the range at index "+ index);
		}
		else
		{
			System.out.println("\nElement "+ ele +" not found in the range.");
		}
		sc.close();
	}

}
