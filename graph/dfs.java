
package graph;

import java.util.Stack;

public class dfs 
{
    public static void main(String[] args)
    {
        Stack<String> st = new Stack<>();
        
        st.push("0");
        
        while(!st.isEmpty())
        {
            String node = st.pop();
            
            System.out.print(node+" ");
            
            if(node.equals("0"))
            {
                st.push("2");
                st.push("1");
            }
            if(node.equals("1"))
            {
                st.push("4");
                st.push("3");
            }
        }
        
    }
    
}
