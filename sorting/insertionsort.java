public class insertionsort {
    public static int insertion_sort(int arr[],int n)
    {  int swaps=0;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
                swaps++;
            }
        }
        return swaps;
        
    }
     public static void printarray(int arr[],int n)
    {
    	for(int i=0;i<n;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    }
    public static void main(String[] args) {
        int[] arr = {10, 8, 6, 4, 2};
        int n = arr.length;
        System.out.println("swaps are :"+ insertion_sort(arr, n));
        printarray(arr, n);
        //big O(n^2) time complexity
    }
}
