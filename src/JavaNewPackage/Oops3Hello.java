package JavaNewPackage;

public class Oops3Hello 
{
    public static void main(String[] args)
    {
        Oops3Sample object1= new Oops3Sample();
        Oops3Sample object2= new Oops3Sample();

        object1.num1=5;
        object1.num2=6;

        object2.num1=7;
        object2.num2=10;

        object1.CalculateSum();
        object2.CalculateSum();

        object1.DisplaySum();
        object2.DisplaySum();
    }
}
