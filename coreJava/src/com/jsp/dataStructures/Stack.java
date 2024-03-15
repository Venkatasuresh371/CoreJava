package com.jsp.dataStructures;

public class Stack 
{
	private Node first=null;
	private int count=0;

	public int size()
	{
		return count;
	}
	public void push(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null);
			count++;
			return;
		}
		//Node curr=first;
		first=new Node(e,first);
		count++;

	}
	public Object pop()
	{
		if(first==null)
			System.out.println("stack is empty");
		Object e=first.ele;
		first=first.next;
		return e;
	}
	public boolean isEmpty()
	{
		if(size()==0) return true;
		return false;
	}
	public String toString()
	{
		if(first==null) return "[]";
		String s="[" + first.ele;
		Node curr=first;
		while(curr.next!=null)
		{
			curr=curr.next;
			s=s+","+curr.ele;
		}
		s=s+"]";
		return s;
	}

}
