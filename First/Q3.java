import java.util.*;

class Q3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Principal amount:");
        int p=sc.nextInt();
        System.out.print("Enter the Time period(in years):");
        int t=sc.nextInt();
        System.out.print("Enter the Interest rate:");
        int r=sc.nextInt();
        int si=p*r*t;
        System.out.println("The Simple Interest is:"+ si);
    }
}