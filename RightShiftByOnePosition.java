package Arrays_Logical_Questions.Day_06_Shifting;

/* Right Shift by One Position
   Write a program to shift all the elements of an array {1, 2, 3, 4, 5} to the right by one position. The first element should be moved
   to the last position.
   Output: {5, 1, 2, 3, 4}
*/

public class RightShiftByOnePosition 
{
	public static void rightShift(int[] arr)
	{
		int temp = arr[arr.length-1];
		
		for(int i=arr.length-1; i>0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
		System.out.print("After right shifting array: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		rightShift(arr);
	}

}
