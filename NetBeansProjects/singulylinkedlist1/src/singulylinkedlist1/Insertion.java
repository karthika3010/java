
package singulylinkedlist1;


public class Insertion
{
    Node head;
    
    void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp.next=temp;
            }
            temp.next=newnode;
        }
    }
    
    void display()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("list is empty");
          
        }
        else
        {
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
    }
    
}
