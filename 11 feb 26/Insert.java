
package day42;


public class Insert
{
    Node head;
    
    void insertathead(int id,String brand,double price)
    {
        Node newnode=new Node(id,brand,price);
        newnode.next=head;
        head=newnode;
    }
    
    void insertionattail(int id,String brand,double price)
    {
        Node newnode=new Node(id,brand,price);
        
        if(head==null)
        {
            head=newnode;
            return;
        }
        
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    
    void display()
    {
        if(head==null)
        {
            System.out.println("no mobiles available");
            return;
        }
        Node temp=head;
        System.out.println("available mobiles:");
        while(temp!=null)
        {
            System.out.println("Mobile_id:"+temp.mob_id+"Mobile_brand:"+temp.brand_name+"Price:"+temp.price);
            temp=temp.next;
        }
    }
    
}
