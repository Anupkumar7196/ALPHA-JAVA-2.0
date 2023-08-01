import java.util.*;
public class BinarytoDecimal{
    public static void BintoDeci(int binNum)
    {
        int pow=0;
        int decimal=0;
        while(binNum> 0)
        {
            int lastDigit= binNum % 10;
            decimal = decimal +(lastDigit * (int)Math.pow(2,pow)); 
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of " + binNum + " = "+ decimal);
    }
    public static void DecitoBin(int decNum)
    {
        int binary=0;
        int pow=0;
        while(decNum>0){
            int rem=decNum%2;
            binary= binary + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum=decNum/2;
        }
        System.out.println("The binary of "+decNum + " = " + binary);
    }
    public static void AveofThreenu(int num1,int num2,int num3)
    {
        float avarage= (num1+num2+num3)/3;
        System.out.println("The average of three number " + avarage);
    }
    public static boolean EvenOdd(int num){
        
        if(num % 2 ==  0)
        {
            return true;
        }
        else{
            return false;
        }
    

    }
    public static boolean isPalindrome(int num){
        int palindrome=num;
        int reverse=0;
        while(palindrome!=0)
        {
            int remender = palindrome % 10;
            reverse = reverse * 10 + remender;
            palindrome = palindrome / 10;
        }
        if(num == reverse)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void Mathsclass(double x, double y){
        // Return the maximum of two numbers 
        System.out.println("Maximum number of x and y is :" +Math.max(x,y));
        // Return the square root of y 
        System.out.println("Square root of x :" +Math.sqrt(x));
        System.out.println("Square root of y :" +Math.sqrt(y));
        // Return the Power 
        System.out.println("Power of x and y :" +Math.pow(x,y));
        // Return the Logarithm of given value 
        System.out.println("Logarithm of x is :" +Math.log(x));
        System.out.println("Logarithm of y is :" +Math.log(y));
        // Return the logarithm of given value when base is 10
        System.out.println("Logarithm10 of x is :" +Math.log10(x));
        System.out.println("Logarithm10 of y is :" +Math.log10(y));
        // Return the Exponential value 
        System.out.println("Exp of x is :" +Math.exp(x));
        System.out.println("Exp of y is :" +Math.exp(y));
    }
    public static int sumDigits(int n)
    {
        int SumofDigit=0;
        while(n>0)
        {
            int lastDigit = n % 10;
            SumofDigit += lastDigit;
            n /=10;
        }
        return SumofDigit;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        // System.out.println("Enter the binary number : ");
        // int n=in.nextInt();
// Binary to Decimal 
        // BintoDeci(n);
// Decimal to binary
        // DecitoBin(n);
// Average of three number 
        // System.out.println("Enter the first number : ");
        // int n1=in.nextInt();
        // System.out.println("Enter the second number : ");
        // int n2=in.nextInt();
        // System.out.println("Enter the third number : ");
        // int n3=in.nextInt();
        // AveofThreenu(n1, n2, n3);
// Even or Odd
        // System.out.println("Enter the any number : ");
        // int n=in.nextInt();
        // if(EvenOdd(n)){
        //     System.out.println("Number is even ");
        // }
        // else{
        //     System.out.println("Number is false ");
        // }
        // EvenOdd(n);
// Palindrome Reverse
        // System.out.println("Enter an integer ");
        // int n = in.nextInt();
        // if(isPalindrome(n))
        // {
        //     System.out.println("Number :" + n + " is a palindrome ");
        // }
        // else
        // {
        //     System.out.println("Number :" + n + " is not a palindrome ");
        // }
// Maths class in java
            // System.out.println("Enter the first number ");
            // int num1=in.nextInt();
            // System.out.println("Enter the second  number ");
            // int num2=in.nextInt();
            // Mathsclass(num1, num2);
// Assignment question 5
            System.out.println("Enter any numbre ");
            int num1=in.nextInt();
            System.out.println("The sum is " + sumDigits(num1));
            in.close();
    }
}