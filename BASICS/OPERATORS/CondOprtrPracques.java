import java.util.*;
public class CondOprtrPracques {
    public static void main(String args[])
    {
        // question 1: Write a java program to get a number from the user and print whether it is positive or negative
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter any number ");
        // int number=sc.nextInt();
        // if(number > 0)
        // {
        //     System.out.println("Positive :"+ number );
        // }
        // else
        // {
        //    System.out.println("Negative :"+ number ); 
        // }
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your temperature");
        // double temperature = sc.nextDouble();
        // if(temperature > 100)
        // {
        //     System.out.println("Your have fever ,temperatur is  :"+ temperature );
        // }
        // else
        // {
        //    System.out.println("You do not have fever, temperature is :"+ temperature ); 
        // }

        // Question 3: Write a java program to input week number (1-7) and print day of week name using switch case
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number");
        // int num=sc.nextInt();
        // switch(num)
        // {
        // case 1 : System.out.println("Monday");
        // break;
        // case 2 : System.out.println("Tuesday");
        // break;
        // case 3 : System.out.println("Wednesday");
        // break;
        // case 4 : System.out.println("Thrusday");
        // break;
        // case 5 : System.out.println("Friday");
        // break;
        // case 6 : System.out.println("Saturday");
        // break;
        // case 7 : System.out.println("Sunday");
        // break;
        // default : System.out.println("You are out of the week");
        // }


        //Question 4: What will be the value of x & y in the following program:
        // int a = 63, b =36;
        // boolean x = (a<b)?true:false;
        // int y=(a>b)?a:b;
        // System.out.println(x);
        // System.out.println(y);

        // Question 5: Write a java program that takes a year from the user and print whether that year is a leap year or not.
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("Enter the year ");
        int year = sc.nextInt();
        boolean x = (year % 4==0);
        boolean y=(year%100 !=0);
        boolean z=(year%100==0 && year%400==0);
        if(x && (y || z))
        {
            System.out.println(year + "is a leap year");
        }
        else
        {
            System.out.println(year + "is not a leap year");
        }

    }
}
