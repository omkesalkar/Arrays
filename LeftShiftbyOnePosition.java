package Arrays_Logical_Questions.Day_06_Shifting;

/* Left Shift by One Position
   Write a program to shift all the elements of an array {1, 2, 3, 4, 5} to the left by one position. 
   The last element should be moved to the first position.
   Output: {2, 3, 4, 5, 1}
*/

public class LeftShiftbyOnePosition 
{
	public static void leftShift(int[] arr)
	{
		int temp = arr[0];
		
		for(int i=0; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1]; 
		}
		arr[arr.length-1] = temp;
		
		System.out.print("After left shifting array: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		leftShift(arr);
	}

}
