import java.util.*;

class Q4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int n1=sc.nextInt();
        System.out.print("Enter the Second Number:");
        int n2=sc.nextInt();
        System.out.print("Enter the operator:");
        char op=sc.next().charAt(0);
        if (op=='+')
        {
            System.out.println("Addition of the two number is "+(n1+n2));
        }
        else if (op=='-')
        {
            System.out.println("Subtraction of the two number is "+(n1-n2));
        }
        else if (op=='*')
        {
            System.out.println("Multiplication of the two number is "+(n1*n2));
        }
        else if (op=='/')
        {
            System.out.println("Addition of the two number is "+(n1/n2));
        }
        else
        {
            System.out.println("Enter a valid operator");
        }
    }
}