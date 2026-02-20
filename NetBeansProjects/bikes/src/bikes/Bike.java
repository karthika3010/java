
package bikes;


public class Bike 
{
    private String BikeName;
    private String OwnerName;
    private double price;
    
    static int BikeCount=0;
    
    final String ShowRoomName="ELITE RESALE BIKES";
    
    Bike(String BikeName,String OwnerName,double price)
    {
        this.BikeName=BikeName;
        this.OwnerName=OwnerName;
        this.price=price;
        BikeCount++;
    }

    
    public String getBikeName()
    {
        return BikeName;
    }
    
    public String getOwnerName()
    {
        return OwnerName;
    }
    
    public double getprice()
    {
        return price;
    }
    
    void displayDetails()
    {
        System.out.println("Showroom Name:"+ShowRoomName);
        System.out.println("BikeName:"+BikeName);
        System.out.println("OwnerName:"+OwnerName);
        System.out.println("Price:"+price);
        
    }
    
    
}
