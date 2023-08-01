import java.util.*;
public class continueStatement {
    public static void main(String args[])
    {
     // to skip an iteration
    
    // for(int i=0;i<=5;i++)
    // {
    //     if(i==3)
    //     {
    //         continue;
    //     }
    //     System.out.println(i);
    // }

    // Display all nummbers entered by user except multiple of 10
    Scanner sc=new Scanner(System.in);
    sc.close();
    do{
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        if(n%10==0)
        {
            continue;
        }
        System.out.println("the number was "+ n);
    }while(true);
    }
}
