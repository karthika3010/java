import java.util.Arrays;
class MergeSort
{
	public static void main(String[] args)
	{
		int arr[]={10,3,7,1,9,4,8};
		MergeSort m=new MergeSort();
		int[] newarr = m.divide(arr);
		m.print(newarr);
		int mid=newarr.length/2;
		System.out.println("middle element:"+newarr[mid]);
	}
	public void print(int[] arr)
	{
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
	public int[] divide(int[] arr)
	{
		if(arr.length==1)
		{
			return arr;
		}
		int mid=arr.length/2;
		int[] left=divide(Arrays.copyOfRange(arr,0,mid));
		int[] right=divide(Arrays.copyOfRange(arr,mid,arr.length));
		return merge(left,right);
	}
	public int[] merge(int[] left,int[] right)
	{
		int[] newarr=new int[left.length+right.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
			{
				newarr[k]=left[i];
				i++;
				k++;
			}
			else if(left[i]>right[j])
			{
				newarr[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<left.length)
		{
			newarr[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			newarr[k]=right[j];
			j++;
			k++;
		}
		return newarr;
	}
}