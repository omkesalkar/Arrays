package Arrays_Logical_Questions.Day_03_ArrayBInarySearch;

//By sorting and using one for loop.

import java.util.Arrays;

public class FindArrayFrequency03 
{
	public static void findFrequency(int[] arr)
	{
		Arrays.sort(arr);
		int count = 1;
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] == arr[i+1])
			{
				count++;
			}
			else 
			{
				System.out.println(arr[i] +" present "+ count +" times");
				count = 1;
			}
			
			if(i+1 == arr.length-1)
			{
				System.out.println(arr[i+1]+ " present "+ count +" times");
			}
		}
		
	}

	public static void main(String[] args) 
	{
		 int[] arr = {1,2,3,2,4,3,5,4,6,5};
		 findFrequency(arr);
	}

}
