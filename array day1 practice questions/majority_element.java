import java.util.*;
public class majority_element {
    public static int majorityEl(int arr[],int n)
    {
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans=arr[i];
            for(int j=0;j<n;j++)
            {
                if(ans==arr[j])
                {
                    count++;
                }
                else if (count>n/2) {
                    return ans;
                }           
            }
        }
        return ans;
        //this is brute force approach which gives bigo(n^2) time complexity
    }

    //optimize approach using sorted array with big o(nlogn)
    public static void Majority_element( int arr[],int n)
    {
        int count =0;
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
                if(count>n/2)
                {
                   System.out.println("Majority element: " + arr[i]);
                }

            }
           
        }
        
        
        
    }

    // another optimize approach which is moore's  voting algorith
    public static int mooreVoting(int arr[], int n)
    {
        int count =0;
        int ans=0;
       
        for(int i=0;i<n;i++)
        {
              
            if(count==0)
            {
                ans=arr[i];

            }
            if (ans==arr[i])
            {
                count ++;

            }
            else  {
                count--;
            }
        }
        return  ans;
    }
    
    public static void main(String[] args) {
        int arr[]={2,1,3,2,2,1,2,};
        int n=arr.length;
        System.out.println("majority element is "+ mooreVoting(arr, n));
    }
}
