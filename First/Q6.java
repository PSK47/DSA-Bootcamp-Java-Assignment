import java.util.*;

class Q6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the currency in rupees:");
        double inr=sc.nextDouble();
        System.out.println("The currency in US dollar is:"+(inr*0.012)); //1 inr= 0.012 usd
    }
}