import java.util.Scanner;

public class conditional {
    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        
        if(age>=18)
        {
            System.out.println("adult : u can vote");
        }
        else if(age>12 && age<18){
            System.out.println("u are teeen");
        }
        else {
            System.out.println("u are not born");

        }

    }
}
