public class duplicate {

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    public static boolean containsDuplicate(int arr[]) {
        for(int i=0;i<=arr.length-1;i++)
        {
           for(int j=i+1;j<arr.length;j++)
           {
            if(arr[i]==arr[j]){
                return true;
            }
           
           }
        }
        return false;
    }
    public static void main(String[] args)
    {
        //int arr[]={1,1,1,3,3,4,3,2,4,2};
        int arr2[]={1,2,3,4};
        System.out.println(containsDuplicate(arr2));

    }
}
