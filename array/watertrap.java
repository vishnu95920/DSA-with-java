public class watertrap {
    public static int trappedrainwater(int height[])
    {
        //calculate left max boundary--array
        int leftmax_bound[]=new int [height.length];
        leftmax_bound[0]=height[0];
        int rightmax_bound[]=new int [height.length];
        rightmax_bound[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++)
        {
            leftmax_bound[i]=Math.max(height[i],leftmax_bound[i-1  ]);
        }
        // calculate right max boundary--array
        for(int i=height.length-2;i>=0;i--)
        {
           rightmax_bound[i]=Math.max(height[i],rightmax_bound[i+1]);
        }

         int trappedrainwater=0;
         //loop
         for(int i=1;i<height.length;i++)
         {
            //waterLevel=min(leftmax_bound,rightmax_bound)
        //trapped_water=eaterlevel=height[i]
            int waterLevel=Math.min(leftmax_bound[i],rightmax_bound[i]);

            trappedrainwater+=waterLevel-height[i];
         }
         return trappedrainwater;
        
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(height));

    }
}