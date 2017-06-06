package firstStage;

import java.util.ArrayList;
import java.util.Scanner;

public class JailEscape
{
	public static void main(String[] args) 
	{
		System.out.println("Enter height of your escape");
		System.out.println("Enter height which you will slip");
		System.out.println("Enter the number of walls");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt(),n=sc.nextInt();
		int[] h=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter height of "+i+1+"th wall");
			h[i]=sc.nextInt();
		}
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			if(h[i]<=x)
			{
				al.add(1);
			}
			else
			{
				al.add(1);
				int remainingHeight=h[i]-(x-y);
				while(remainingHeight>0)
				{
					al.add(1);
					remainingHeight=remainingHeight-(x-y);
				}
			}
			
			
		}
		System.out.println("The number of jumps taken "+al.size());
	}

}
