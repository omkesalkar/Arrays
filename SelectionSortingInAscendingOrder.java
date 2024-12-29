package Arrays_Logical_Questions.Day_07_Sorting;

/* Selection Sort Questions
   a. Basic Selection Sort
   Write a program to sort an array {9, 7, 5, 3, 1} 
   in ascending order using Selection Sort.
   Output: {1, 3, 5, 7, 9}
*/
public class SelectionSortingInAscendingOrder 
{
	public static void ascendingSelectionSort(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int smallest = i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[smallest] > arr[j])
				{
					smallest = j ;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
		
		System.out.print("Selection Sorted Array in Ascending order:  ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {9,7,5,3,1};
		ascendingSelectionSort(arr);
	}

}
