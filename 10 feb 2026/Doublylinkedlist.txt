
package doublylinkedlist;

public class Doublylinkedlist {

  
    public static void main(String[] args)
    {
        Insertion in=new Insertion();
        in.addback(10);
        in.addback(20);
        
        in.addmid(30,3);
        
        in.addback(40);
        in.addback(50);
    
        in.display();                                                                               
    }
    
}
