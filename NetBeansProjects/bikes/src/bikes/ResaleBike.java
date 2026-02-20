
package bikes;


public class ResaleBike extends Bike implements ResaleOperations
{
    
    @Override
    public void addbike()
    {
        System.out.println("Bike Added Successfully!!");
    }
    
    @Override
    public void viewbike()
    {
        System.out.println("Bike Details are:");
        Bike bike=new Bike();
        bike.displayDetails();
    }
}
