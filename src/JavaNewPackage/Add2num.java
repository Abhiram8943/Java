package JavaNewPackage;

import java.util.Scanner;

public class Add2num {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter 2 numbers to add: ");
        
        int a=s.nextInt();
        int b=s.nextInt();

        int c=a+b;

        System.out.println("result is"+c);
    }

}
