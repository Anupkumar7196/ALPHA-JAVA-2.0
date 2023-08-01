
public class Array {
    public static int LinearSearch(int numbers[], int key){
        for(int i=0;i<=numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=12;
        int index=LinearSearch(numbers,key);
        if(index==-1){
            System.out.println("Key not found in the index");
        }
        else{
            System.out.println("Key is found in the index");
        }
    }
}
