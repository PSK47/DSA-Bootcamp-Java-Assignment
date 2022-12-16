import java.util.*;

class Q9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int temp=num,count=0;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        temp=num;
        int arm=0;
        while(temp>0)
        {
            arm+=Math.pow(temp%10,count);
            temp=temp/10;
        }
        if(num==arm)
        {
            System.out.println("The entered number is an Armstrong number");
        }
        else
        {
            System.out.println("The entered number is not an Armstrong number");
        }
    }
}