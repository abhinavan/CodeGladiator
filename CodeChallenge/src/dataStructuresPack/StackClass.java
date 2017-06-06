package dataStructuresPack;

public class StackClass
{
	private int maxSize;
	private int top;
	private int[] stackArray;
	
	// constructor to initialize size of stack
	public StackClass(int size)
	{
		maxSize=size;
		top=-1;
		stackArray=new int[maxSize];
	}
	// method to insert an element in stack
	public void push(int a)
	{
		stackArray[++top]=a;
	}
	// method to remove element from stack
	public int pop()
	{
		return stackArray[top--];
	}
	// to check whether stack is full
	public boolean isFull()
	{
		if(top==maxSize-1)
		{
			return true;
		}
		return false;
	}
	// to check whether stack is empty
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		StackClass stack=new StackClass(10);
		
		while(!stack.isFull())
		{
			stack.push((int)(Math.random()*1000));
		}
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}

}
