import java.util.Scanner;

public class javabasics{
    public static void main(String arg[]) {
        System.out.print("hello ");
        // a=10;
        //int b=5;
        byte b=8;
        System.out.println(b);
        char a='a';
        System.out.println(a);

        //taking t
        Scanner sc = new Scanner(System.in);
        // String input=sc.nextLine();
        // System.out.println(input);
        // sum of a and b
        int x=sc.nextInt();

        int y=sc.nextInt ();
        int sum=x+y;
        int product=x*y;
        System.out.println("sum="+sum);
        System.out.println("product="+product);
    }
}