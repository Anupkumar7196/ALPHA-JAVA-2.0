import java.util.*;
public class doWhileLoop {
    public static void main(String args[])
    {
        // do{
            // do somthing 

        // }while(condition)

        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int counter=0;
        do{
            System.out.println("Anup kumar");
            counter ++;
        }while(counter<=num);
    }
}
