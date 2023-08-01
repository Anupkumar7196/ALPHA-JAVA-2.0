import java.util.*;
public class TernaryOperator {
    public static void main(String args[])
    {
        //variable = condition? statement1:statement2
        //: means nahi to 
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter any number ");
        // int number = sc.nextInt();

        //Ternary Operator 
        // String type=((number%2)==0) ? "EVEN" : "ODD";
        // System.out.println(type);

        // CHECK IF A STUDENT WILL PASS OR FAIL
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("Enter the marks of student ");
        int marks = sc.nextInt(); 
        String Status=(marks>=33) ? "PASS" : "FAIL";
        System.out.println(Status);
    }
}
