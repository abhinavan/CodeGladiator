package sortingPack;

import java.util.Scanner;

public class HeightBubbleSortClass 
{
	
	public static int[] sort(int[] arr)
	{
		int temp=arr[0];
		for(int i=0;i<(arr.length);i++)
		{
			for(int j=1;j<(arr.length)-1;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		return arr;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" element");
			arr[i]=sc.nextInt();
		}
		sort(arr);
		
	}
	
}
