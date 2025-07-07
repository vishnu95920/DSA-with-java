public class searchreverse {
    public static int search(int arr[],int n,int target)
    {    
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=start +(end-start)/2;
            if (arr[mid]==target) {
                return mid;
                
            }
            //left half sorted or not
           if (arr[start]<=arr[mid]) {
             if (arr[start]<=target && arr[mid]>target) {
                end=mid-1;

            }
            else{
                start=mid+1;
            }
           }
          else{
            //right half sorted or not
            if (arr[mid]<target&& target<=arr[end]) {
                start=mid+1;
            }
            else 
            {
                end=mid-1;
            }
        }
            
        }
        return -1;
    

    }
    public static void main(String[] args)
    {
        int arr[]={4,5,6,7,0,1,2};
        int n=arr.length;
        int target=0;
        System.out.println("target is at" +" "+ search(arr,n,target));
    }
}
