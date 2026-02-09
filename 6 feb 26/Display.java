class Display
{
	void display(Product head)
	{
		Product temp=head;
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		while(temp!=null)
		{
			System.out.print(temp.product_id+"->");
			System.out.print(temp.product_name+"->");
			System.out.print(temp.price+"->");
			temp=temp.next;
		}
		
	}
}