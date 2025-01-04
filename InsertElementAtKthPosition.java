package Arrays_Logical_Questions.Day_08_Insertion_Deletion;

/*Insert an Element at a Specific Position
 Write a program to insert an element 10 at the kth position 
 of the array {1, 2, 3, 4, 5} and k = 3.
 Output: {1, 2, 10, 3, 4, 5}
*/

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtKthPosition 
{
	public static void insertElementKthPosition(int[] arr, int k, int ele)
	{
		int[] newArray = new int[arr.length + 1];
		int position = k - 1; // Convert 1- based index to 0-based index
		
		for(int i=0, j=0; i<newArray.length; i++)
		{
			if(i == position)
			{
				newArray[i] = ele;  // Insert the new element at kth position
			}
			else
			{
				newArray[i] = arr[j];
				j++;
			}
		}
		
		System.out.println("Old Array: "+ Arrays.toString(arr));
		System.out.println("New Array: "+ Arrays.toString(newArray));
	}

	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter kth position: ");
		int k = sc.nextInt();
		System.out.print("Enter element to add kth position: ");
		int ele = sc.nextInt();
		
		if (k<1 || k>arr.length + 1) 
        {
            System.out.println("Invalid position! Please enter a position between 1 and " + (arr.length + 1));
        } 
        else 
        {
            insertElementKthPosition(arr, k, ele);
        }
		sc.close();
	}

}
