import java.util.Scanner;

public class loops {
    public static void main(String args[]){
        int count=1;
        // while(count<=10)
        // {
        //     System.out.println(count);
        //     count++;
        // }
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //1 to n
        // while (count<=n) {
        //     System.out.println(count+ " ");
        //     count++;
            
        // }
        System.out.println("sum of n natural numbers");
        int sum=0;
        int i=1;
        while (i<=n) {
            sum=+i;
            i++;
        }
        

    }
}
