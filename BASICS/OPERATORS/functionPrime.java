
public class functionPrime {
    // public static boolean isPrime(int n){
    //     // boolean isPrime=true;

        
    //     for(int i=2;i<=n-1;i++)
    //     {
    //         if(n%i==0)
    //         {
    //             // isPrime=false;
    //             // break;
    //             // return isPrime;
    //             return false;

    //         }
    //     }
    //     return true;
        
    // }
// Optimized prime function 
    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

//Primes in a Range
    public static void primesInRange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i)){//true
                System.out.println(i+" , ");
            }
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter any number : ");
        // int num=sc.nextInt();
        primesInRange(16);

        

    }
}
