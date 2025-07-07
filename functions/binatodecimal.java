public class binatodecimal {
    public static void binatodec(int bin)
    {     int result=bin;
      int pow=0;
      int dec=0;
      while (bin>0) {
        int lastdigit =bin%10;
        dec=dec+(lastdigit*(int)Math.pow(2, pow));
        pow++;
        bin=bin/10;
    
      }
      System.out.println("decimal of "+result+"="+dec);
 
    }
    //decimal to binary
    public static void decTobin(int n)
    {    int dec=n;
         int pow=0;
         int bin=0;
         while(n>0)
         {
            int reminder=n%2;
            bin=bin+(reminder*(int)Math.pow(10, pow));
            pow++;
            n=n/2;

         }
         System.out.println("binary of "+dec+"="+bin);
    }
    
    public static void main(String[] args) {
        binatodec(1111);
        decTobin(15);
    }
         
}
