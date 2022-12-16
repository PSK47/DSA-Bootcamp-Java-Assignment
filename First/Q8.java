import java.util.*;

class Q8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String to check:");
        String palin=sc.nextLine();
        String reverseStr = "";
        for (int i = (palin.length() - 1); i >=0; --i)
        {
            reverseStr = reverseStr + palin.charAt(i);
        }

        if (palin.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(palin + " is a Palindrome String.");
        }
        else {
            System.out.println(palin + " is not a Palindrome String.");
        }
    }
}