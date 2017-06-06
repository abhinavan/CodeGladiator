package sortingPack;

import java.util.Scanner;

public class PersonHeightSorting 
{
	public void sortHeight(String[] playerArray,Integer[] heightArray)
	{
		int i,j,key;
		for(i=1;i<playerArray.length;i++)
		{
			key=heightArray[i];
			j=i-1;
			while(j>=0 && key<heightArray[j])
			{
				playerArray[j+1]=playerArray[j];
				j--;
			}
			heightArray[j+1]=key;
		}
		for(String s:playerArray)
		{
			System.out.println(s);
		}
		for(Integer a:heightArray)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of team");
		int size=sc.nextInt();
		String[] playerArray=new String[size];
		Integer  heightArray[]=new Integer[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter player name");
			playerArray[i]=sc.next();
			System.out.println("Enter player height in cms");
			heightArray[i]=sc.nextInt();
		}
		new PersonHeightSorting().sortHeight(playerArray, heightArray);
	}

}
