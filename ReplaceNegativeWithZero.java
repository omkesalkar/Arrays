package Arrays_Logical_Questions.Day_05_ReplacingSwappingArray;

/*Replace Negative Numbers with Zero.
  Write a program to replace all negative numbers in the array {1, -2, 3, -4, 5} with 0.
  Example: Resulting array should be {1, 0, 3, 0, 5}.
*/

public class ReplaceNegativeWithZero 
{
	public static void replaceNegative(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] < 0)
			{
				arr[i] = 0;
			}
		}
		
		System.out.print("After replacing negative to zero: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}

	public static void main(String[] args)
	{
		int[] arr =  {1, -2, 3, -4, 5};
		replaceNegative(arr);
	}

}
