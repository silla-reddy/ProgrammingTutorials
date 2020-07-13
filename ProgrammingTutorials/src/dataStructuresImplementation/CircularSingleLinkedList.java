package dataStructuresImplementation;

public class CircularSingleLinkedList {
	
	public class Node
	{
		Node next;
		int value;
		public Node(int value)
		{
			this.value=value;
		}
		
	}
	Node head=null;
	Node tail=null;
	
	public void insertData(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			newNode.next=head;
		}
		else
		{
			Node tempNode=head;
			while(tempNode.next!=head)
			{
				tempNode=tempNode.next;
			}
			tempNode.next=newNode;
			newNode.next=head;
			tail=newNode;
		}
	}
	
	public void display()
	{
		Node temp=head;
		do
		{
			System.out.println(temp.value);
			temp=temp.next;
		}while(temp.next!=head.next);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularSingleLinkedList cs=new CircularSingleLinkedList();
		cs.insertData(1);
		cs.insertData(12);
		cs.display();
	}

}
