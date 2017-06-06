package dataSturcturePack;

import java.util.Scanner;

public class ArrayBinarySearchClass 
{
	public static int findElementByBinarySearch(int[] arr,int toBeSearched)
	{
		int count=arr.length-1;
		while(count>0)
		{
			int lowerBound=0;
			int upperBound=arr.length-1;
			int pivot=(lowerBound+upperBound)/2;
			if(arr[pivot]==toBeSearched)
			{
				return pivot;
			}
			else if(arr[pivot]<toBeSearched)
			{
				lowerBound=pivot+1;
			}
			else if(arr[pivot]>toBeSearched)
			{
				upperBound=pivot-1;
			}
		count--;
		}
		return count;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+i+1+" element");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to be searched");
		int toBeSearched=sc.nextInt();
		System.out.println(findElementByBinarySearch(arr, toBeSearched));
	}

}
