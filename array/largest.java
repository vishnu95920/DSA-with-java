public class largest {
    public static void main(String[] args) {
        int arr[]={2,5,4,88,5,525,223,15,44};
        int largestt=Integer.MIN_VALUE;// -infinity
        int smallest=Integer.MAX_VALUE; //infinty
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largestt)//largest
            {
                largestt=arr[i];

            }
            if(arr[i]<smallest)//smallest
            {
                smallest=arr[i];
            }
        }
        System.err.print("largest number is "+ largestt);
        System.err.println();
         System.err.print("smallest number is "+ smallest);

    }
}
