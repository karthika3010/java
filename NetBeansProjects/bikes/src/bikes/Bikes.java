
package bikes;

import java.util.Scanner;


public class Bikes 
{

    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The Bike Name:");
        String BikeName=sc.nextLine();
        
        System.out.println("Enter The Owner Name:");
        String OwnerName=sc.nextLine();
        
        System.out.println("Enter the Price:");
        double price=sc.nextDouble();
        
        StringBuilder Bikename=new StringBuilder(BikeName);
        Bikename.append("Verified Bike");
        
        
        StringBuffer Ownername=new StringBuffer(OwnerName);
        Ownername.append("Verified Seller");
        
        ResaleOperations ro=new ResaleOperations();
        {
           ro.addbike();
           ro.viewbike();
        
        }
        
        
        System.out.println("Total Num of Bikes:"+BikeCount);
        
     
    }
    
}
