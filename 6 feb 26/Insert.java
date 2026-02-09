class Insert
{
	Product head;
	void increaseproduct(int product_id,String product_name,double price)
	{
		Product pro=new Product(product_id,product_name,price);
		if(head==null)
		{
			head=pro;
			return;
		}
		
		Product temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=pro;
		
	}
	Product getHead()
	{
		return head;
	}

}