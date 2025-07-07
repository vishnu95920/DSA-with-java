//import java.util.Iterator;

public class selectionsort {
    public static void selection_sort(int arr[],int n)
    {
    	
    	for(int i=0;i<=n-1;i++)
    	{
    		int min=i;
    		for(int j=i+1;j<n;j++)
    		{
    			if(arr[j]<arr[min])
    			{
    				min=j;
    				
    			}
    			
    		}
    		int temp=arr[i];
    		arr[i]=arr[min];
    		arr[min]=temp;
    	}
    }
    public static void printarray(int arr[],int n)
    {
    	for(int i=0;i<n;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    }
    public static void main(String[] args)
    {
        int [] arr = {5,4,1,2,6,3};
        int n=arr.length;
        selection_sort(arr, n);
        printarray(arr, n);
        
    }
    
}
