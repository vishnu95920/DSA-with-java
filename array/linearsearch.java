import java.util.*;
public class linearsearch {
     public static int linear_search(int nums[],int key)
     {
        for(int i=0;i<=nums.length;i++)
        {
            if(nums[i]==key)
            {
                return i;
            }
           
            
        }
        return -1;

     }
    public static void main(String[] args)
    {
        int nums[]={2,5,5,9,3,5,9,6,8};
        int key=6;
        int index =linear_search(nums,key);
        if(index==-1)
        {
            System.out.print("not found");
        }
        else {
            System.out.print("found at index "+ index);
        }

    }
}

