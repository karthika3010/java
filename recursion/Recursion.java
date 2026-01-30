class Recursion
{
	public static void main(String[] args)
	{
		Recursion r=new Recursion();
		r.print(0);
	}
	void print(int index)
    {
		int arr[]={10,20,30,40,50};
		if(index<arr.length)
		{
			System.out.println(arr[index]);
			index=index+1;
			print(index);
		}
		
	}
}	
		
	
