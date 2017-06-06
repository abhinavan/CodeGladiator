package dataStructuresPack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass 
{
	public static void main(String[] args) 
	{
		Queue<Integer> queue=new LinkedList<>();
		for(int i=0;i<10;i++)
		{
			queue.add(i);
		}
		System.out.println("Elements of queue are "+queue);
		int removedItem=queue.remove();
		System.out.println("Elements removed is "+removedItem);
		
		int head=queue.peek();
		System.out.println("Element on head is "+head);
		
	}

}
