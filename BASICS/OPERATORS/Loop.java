import java.util.*;
public class Loop {
    public static void main(String args[])
    {
        //While loop syntax
        // while(condition)
        // {
        //     // do something
        // }
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter any number");
    // int num=sc.nextInt();
    // int counter=0;
    // while(counter <=num)
    // {
    //     System.out.println("Anup kumar");
    //     counter ++;
    // }
    // System.out.println("printer Anup kumar :" + num);
    // }

    // Print the number from 1 to 10
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter any number");
    // int num=sc.nextInt();
    // int counter=1;
    // while(counter <=num)
    // {
    //     System.out.println(counter);
    //     counter ++;
    // }
    // System.out.println("printer the number is :" + num +"times");
    // }

    // Print the sum of first n natural numbers
    Scanner sc=new Scanner(System.in);
    sc.close();
    System.out.println("Enter any number");
    int num=sc.nextInt();
    int counter=1;
    int sum=0;
    while(counter <=num)
    {
        sum += counter;
        counter ++;
       
    }
    System.out.println(sum);
    }
}
