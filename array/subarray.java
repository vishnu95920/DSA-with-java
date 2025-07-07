public class subarray {

    //MAX SUBARRAY SUM 
    
    public static void subarr(int[] arr, int n) {
        int prefix[]=new int[arr.length];
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }


        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                currentsum=start==0? prefix[end]:prefix[end]-prefix[start-1];
                System.out.println();
                if (maxsum<currentsum) {
                    maxsum=currentsum;
                    
                }
            }
        }
        System.out.println("Maximum sum of subarray is "+maxsum);
    }
    public static void kadanes(int arr[],int n) // big O(n)
    {
        int maxsum=Integer.MIN_VALUE;
        int current_sum=0;
        for(int i=0;i<n;i++)
        {
            current_sum=current_sum+arr[i];
            if(maxsum<0)
            {
                current_sum=0;

            }
            maxsum=Math.max(maxsum, current_sum);
        
        }
        System.out.println("Maximum sum of subarray is "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12};
        int n = arr.length;
        subarr(arr, n);
        kadanes(arr,n) ;// Pass both arr and n
    }
}