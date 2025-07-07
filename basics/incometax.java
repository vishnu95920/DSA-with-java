import java.util.Scanner;

public class incometax {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter ur income please :");
        float income=sc.nextFloat();
        
        if(income>=1200000 && income<1500000)
        {
            System.out.println("Your tax="+income*0.2);
        }
        else if(income>1500000)
        System.err.println("tax is ="+income*0.3);

        else 
        System.err.println("no tax ");

    }
}
