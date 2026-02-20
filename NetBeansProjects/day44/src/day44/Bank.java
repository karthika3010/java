
package day44;



public class Bank 
{
    
    static final String bank_name="ABC Bank";
    static final  double interest_rate=7.5;
    
    
    static  double calculateinterest(double principal,int years)
    {
        
        double interest=(principal*interest_rate*years)/100;
        return interest;
    }
    
    void display(double principal,int years,double interest)
    {
        System.out.println("Bank Name :"+ bank_name);
        System.out.println("principal amount:"+principal);
        System.out.println("Years:"+years);
        System.out.println("Interest Amount:"+interest);
        
        
    }
    
}
