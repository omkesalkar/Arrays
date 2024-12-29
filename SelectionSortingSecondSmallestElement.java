package Arrays_Logical_Questions.Day_06_Shifting;

/*Find the Second Smallest Element
  Using Selection Sort, find the second smallest element 
  in an array {12, 4, 7, 1, 9}.
  Output: 4
*/

public class SelectionSortingSecondSmallestElement
{
	public static void secondSmallest(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int smallest = i;
		
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j] < arr[smallest])
				{
					smallest = j;
				}
				
				int temp = arr[smallest];
				arr[smallest] = arr[i];
				arr[i] = temp;
			}
		}

		System.out.print("Original array: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
		System.out.println();
		System.out.println("Second smallest element: "+ arr[1]);
		
	}

	public static void main(String[] args) 
	{
		int[] arr = {12, 4, 7, 1, 9};
		secondSmallest(arr);
	}
}
