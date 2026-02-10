class Deletion 
{
	Node head;
    void deletion(int delelement)
    {
     
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
    
    if(delelement==head.data)
    {
        head=head.next;
        System.out.println("element is delted");
        return;
    }
    
    Node temp=head;
    
    while(temp.next!=null && temp.next.data!=delelement)
    {
        temp=temp.next;
    }
    if(temp.next!=null)
    {
    temp.next=temp.next.next;
        System.out.println("element deleted");
    }
    else
    {
        System.out.println("element not found");
    }
	
	return ;
    }
        
        
       
     
    
}