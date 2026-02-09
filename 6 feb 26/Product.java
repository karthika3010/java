class Product
{
	int product_id;
	String product_name;
	double price;
	Product next;
	
	public Product(int product_id,String product_name,double price)
	{
		this.product_id=product_id;
		this.product_name=product_name;
		this.price=price;
	}
}
