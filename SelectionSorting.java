package Arrays_Logical_Questions.Day_05_MergingArray;
//Selection sorting finding smallest element/ Smallest first
public class SelectionSorting 
{
	public static void selectionSorting(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int smallest = i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[smallest] > arr[j])
				{
					smallest = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
 		}
		
		System.out.print("After sorting: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {8,9,6,1,2};
		selectionSorting(arr);
	}

}
