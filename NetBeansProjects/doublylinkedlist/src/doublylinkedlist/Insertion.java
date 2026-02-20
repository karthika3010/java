
package doublylinkedlist;


public class Insertion 
{
    Node head;
    Node tail;
    
    void addback(int data)
    {
        Node n=new Node(data);
        if(tail==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            n.next=head;
            head.prev=n;
            head=n;
        }
    }
    
    void addmid(int position,int data)
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        Node temp=head;
        do
        {
            if(temp.data==position)
            {
                Node n=new Node(data);
                n.next=temp.next;
                temp.next=n;
                
                if(temp==tail)
                {
                    tail=n;
                }
                return;
            }
            temp=temp.next;
        }while(temp!=head);
                System.out.println("value not found");
    }
    
    
    
    void display()
    {
        Node temp=tail;
        
        if(tail==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            while(temp!=null)
            {
                System.out.println(temp.data+"->");
                temp=temp.prev;
            }
            
        
        }
        System.out.println("");
    
    }
    
}
