import java.util.Scanner;

public class evenodd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number a:");
        int a=sc.nextInt();
        System.err.println("enter the number b:");
        int b=sc.nextInt();
        if(a%2==0){
            System.err.println("a is even");

        }
        else if(b%2==0)
        System.err.println("b is even");
        else 
        System.err.println("numbers are odd.");

    }
}
