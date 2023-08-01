import java.util.*;
public class function {
    public static void PrintHello()
    {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return;
    }
    public static int Fuctionparameter(int num1,int num2)
    {//parameter of formal parameter
        int sum=num1+num2;
        return sum;
    }
    public static void Swap(int num1,int num2)
    {
        
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("This is the first number : "+num1);
        System.out.println("This is the second number : "+num2);
    }
    public static int Multiply(int a, int b)
    {
        int product=a*b;
        return product;
    }
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
             f= f*i;
        }
        return f;

    }
    public static void main(String args[]){
        // PrintHello();//Fuction call
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter first number : ");
        // int a=sc.nextInt();
        // System.out.println("Enter Second number : ");
        // int b=sc.nextInt();
        // int sum=Fuctionparameter(a,b);// Arguments or actual parameters
        // System.out.println("sum is : "+sum);
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the first number : ");
        // int a=sc.nextInt();
        // System.out.println("Enter the Second number : ");
        // int b=sc.nextInt();
        // Swap(a,b);
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the first number : ");
        // int num1=sc.nextInt();
        // System.out.println("Enter the Second number : ");
        // int num2=sc.nextInt();
        // int prod=Multiply(num1, num2);
        // System.out.println("The product of two number :"+prod);
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the value of n  : ");
        // int a=sc.nextInt();
        // int result=factorial(a);
        // System.out.println("The factorial of "+a +" is : "+result);
        

    }
}
