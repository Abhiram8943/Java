import java.util.Scanner;

public class PrintUserInput {
    public static void main(String[] args)
    {
        System.out.println("enter a number: ");

        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        int b=s.nextInt();

        System.out.println(a+" "+b);
    }
}
