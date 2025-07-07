public class bubblesort {
    public static void bubble_sort(int arr[],int n){
        for(int i=0;i<=n-2;i++)
        {   
            for(int j=0;j<=n-2-i;j++){
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            
        }
       
        }
         
    }
    public static void printarr(int arr[],int n)
     { System.out.println("sorted array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
     }
    
    public static void main(String[] args) {
        int [] arr = {5,4,1,2,6,3};
        int n=arr.length;
        bubble_sort(arr, n);
        printarr(arr, n);


    }
}