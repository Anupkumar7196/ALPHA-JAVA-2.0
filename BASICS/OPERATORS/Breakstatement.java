import java.util.*;
public class Breakstatement {
    public static void main(String args[])
    {
        // for(int i=1;i<=5;i++)
        // {
        //     if(i==3)
        //     {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am out of the looop");


        // Keep entering numbers till user enters a mutiple of 10
        Scanner sc=new Scanner(System.in);
        sc.close();

        do{
            System.out.println("Enter your number");
            int n = sc.nextInt();
            if(n%10 == 0)
            {
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
