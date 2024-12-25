package Arrays_Logical_Questions.Day_03_ArrayBInarySearch;

import java.util.Arrays;

public class findArrayFrequency 
{
	public static void frequencyOfElements(int[] arr)
	{
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++)
		{
			int count = 1, found = 0;
			
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] == arr[j] && i < j)
				{
					count++;
				}
				if(arr[i] == arr[j] && i > j)
				{
					found++;
				}
			}
			if(found == 0)
			{
				System.out.println(arr[i] +" present "+ count +" times.");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,3,2,3,2,2,5,2,6,3};
		frequencyOfElements(arr);              
	}
}
