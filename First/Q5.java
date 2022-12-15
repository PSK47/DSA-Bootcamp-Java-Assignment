import java.util.*;

class Q5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the Second number:");
        int b=sc.nextInt();
        int c=a>b?a:b;
        System.out.println("Largest number of the two is:"+c);
    }
}