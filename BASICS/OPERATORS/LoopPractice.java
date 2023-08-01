import java.util.*;
public class LoopPractice {
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        
        // int num;
        // int choice;
        // int evensum =0;
        // int oddsum=0;
        // do{
        //     System.out.println("Enter the number ");
        //     num=sc.nextInt();
        //     if(num % 2 == 0)
        //     {
        //         evensum += num;
        //     }
        //     else{
        //         oddsum += num;
        //     }
        //     System.out.println("Do you want to continue? Press 1 for yes or 0 for no ");
        //     choice = sc.nextInt();

        // }while(choice==1);
        // System.out.println("Sum of even Number "+ evensum);
        //  System.out.println("Sum of odd Number "+ oddsum);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number ");
        int num=sc.nextInt();
        int even=0;
        int odd=0;
        for(int i=0;i<=num;i++)
        {
            if(i/2==0)
            {
                even= even +i;
            }
            
        }
        System.out.println("sum of even is " + even);
        System.out.println("sum of odd is " + odd);
        sc.close();
    }
}
