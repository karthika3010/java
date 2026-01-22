class Binary
{
	public static void main(String[] args)
	{
		int arr[]={2,5,7,8,12,16,16,23,38};
		int searchvalue=80;
		int left=0;
		int right=arr.length-1;
		
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(searchvalue==arr[mid])
			{
			    System.out.println("The search value index is:"+mid);
		        return;
		    }
		    else if(searchvalue>arr[mid])
		    {
			    left=mid+1;
		    }
		    else if(searchvalue<arr[mid])
		    {
			    right=mid-1;
		    }
		}
		System.out.println("-1");
	}
}