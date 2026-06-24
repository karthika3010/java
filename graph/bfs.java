
package graph;

import java.util.LinkedList;
import java.util.Queue;

public class bfs
{
    public static void main(String[] args) 
    {
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("0");
        
        while(!queue.isEmpty())
        {
            String node = queue.poll();
            
            System.out.print(node +" ");
            
            if(node.equals("0"))
            {
                queue.offer("1");
                queue.offer("2");
            }
            if(node.equals("1"))
            {
                queue.offer("3");
            }
            if(node.equals("2"))
            {
                queue.offer("4");
            }
        }
    }
    
}
