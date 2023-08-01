import java.util.*;
public class Forloop {
    public static void main(String args[])
    {
        // For loop
        // for (initialisation; condition ; updation)
        // {
        //     do something
        // }

        //Print the sum of first n natural nummber 
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter any number ");
        // int num=sc.nextInt();
        // int sum=0;
        // for(int i=0;i<=num;i++)
        // {
        //     sum += i;
        // }
        // System.out.println(sum);

        // Print reverse of a number 
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter any number ");
        // int num=sc.nextInt();
        // int reverse_num=0;
        // while(num !=0)
        // {
        //     int digit = num % 10;
        //     reverse_num=reverse_num * 10 + digit;
        //     num /=10;
        // }
        // System.out.println(reverse_num);

        // 2nd method 
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("Enter any number ");
        int num=sc.nextInt();
        while(num !=0)
        {
            int digit = num % 10;
            System.out.print(digit);
            num /=10;
        }
        System.out.println();
    }
}
