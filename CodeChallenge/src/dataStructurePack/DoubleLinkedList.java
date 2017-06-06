package dataStructurePack;

import java.util.NoSuchElementException;

import javax.lang.model.element.Element;

public class DoubleLinkedList<E> 
{
	private Node head;
	private int size;
	private Node tail;
	
	public DoubleLinkedList() 
	{
		
		size=0;
	}
	// creating a node which have data field,address to next and previous node 
	private class Node
	{
		E element;
		Node prev;
		Node next;
		
		public Node(E element,Node prev,Node next) 
		{
			this.element=element;
			this.next=next;
			this.prev=prev;
		}
		
	}
	
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		return false;
	}
	// if linked list is not empty , then we have to add element before the head element of linked list 
	// if linked list is empty , then add the element as the last element of the linked list 
	public void addFirst(E element)
	{
		Node temp=new Node(element,head,null);
		if(head!=null)
		{
			head.prev=temp;
		}
		head=temp;
		if(tail==null)
		{
			tail=temp;
		}
		size++;
		System.out.println("Adding element at head "+element);
	}
	// if linked list is not empty , then we have to add element after tail element of linked list
	// if linked list is empty , then we have to add element as first element of linked list 
	public void addLast(E element)
	{
		Node temp=new Node(element,tail,null);
		if(tail!=null)
		{
			tail.next=temp;
		}
		tail=temp;
		if(head==null)
		{
			head=temp;
		}
		size++;
		System.out.println("Adding element at last "+element);
	}
	// iterating element from the head 
	public void iterateForward()
	{
		System.out.println("Iterating forward");
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.element);
			temp=temp.next;
		}
	}
	
	// iterating element frome the tail of linked list 
	public void iterateBackward()
	{
		System.out.println("Iterating backward");
		Node temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.element);
			temp=temp.prev;
		}
	}
	
	// if linked list is empty , will throw NoSuchElementException 
	// if linked list is not empty , will delete element at the head and move head to the next element 
	public E removeFirst()
	{
		if(size==0)
		{
			throw new NoSuchElementException();
		}
		Node temp=head;
		head=head.next;
		head.prev=null;
		size--;
		System.out.println("Deleted element "+temp.element);
		return temp.element;
	}
	
	// if linked list is empty , throw NoSuchElementException 
	// if linked list is not empty, will delete element at the tail and move tail to previous element
	public E removeLast()
	{
		if(size==0)
		{
			throw new NoSuchElementException();
		}
		Node temp=tail;
		tail=tail.prev;
		tail.next=null;
		size--;
		System.out.println("Deleted element are "+temp.element);
		return temp.element;
	}
	public static void main(String[] args) 
	{
		DoubleLinkedList<Integer> dll=new DoubleLinkedList<>();
		dll.addFirst(10);
		dll.addFirst(20);
		dll.addLast(40);
		
		dll.iterateForward();
		dll.iterateBackward();
	}

}
