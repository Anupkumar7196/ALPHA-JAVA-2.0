import java.util.*;
public class SwitchStatement {
    public static void main(String args[])
    {
        // Syntax of Switch statement 
        // switch(variable)
        // {
        //     case 1: print statement 
        //     case 2: print statement 
        //     case 3: print statement 
        //     default: print statement
        // }
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number");
        // int num=sc.nextInt();
        // switch(num)
        // {
        //     case 1 : System.out.println("Monday");
        //     break;
        //     case 2 : System.out.println("Tuesday");
        //     break;
        //     case 3 : System.out.println("Wednesday");
        //     break;
        //     case 4 : System.out.println("Thrusday");
        //     break;
        //     case 5 : System.out.println("Friday");
        //     break;
        //     case 6 : System.out.println("Saturday");
        //     break;
        //     case 7 : System.out.println("Sunday");
        //     break;
        //     default : System.out.println("You are out of the week");
        // }

        //CALCULATOR
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("Enter a :");
        int a=sc.nextInt();
        System.out.println("Enter b :");
        int b=sc.nextInt();
        System.out.println("Enter Operator :");
        char operator =sc.next().charAt(0);
        switch(operator)
        {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("Wrong operator");
        }
    }
}
