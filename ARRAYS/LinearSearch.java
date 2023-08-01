package ARRAYS;

public class LinearSearch {
    public static int getLargest(int numbers[]) {
        int larg = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (larg < numbers[i]) {
                larg = numbers[i];
            }
        }
        return larg;
    }

    public static void main(String args[]) {
        int numbers[] = { 12, 20, 30, 40, 50, 60, 70 };
        System.out.println("Largest value is " + getLargest(numbers));
    }
}
