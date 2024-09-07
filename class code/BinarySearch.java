import java.util.*;
public class BinarySearch{
    public static int BinarySear(int number[], int key)
    {
        int start = 0, end = number.length-1;
        while( start <= end)
        {
           int  mid = (start + end)/2;
            if( number[mid] == key)
            {
                return mid;
            }
            if( number[mid]< key)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[])
    {
        // int numbers[] = { 2, 4, 6, 8, 10, 12, 14};
        // int key = 10;
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        int i;
        System.out.println("enter the number");
        for(i=0; i<numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }
        System.out.print("enter the key: ");
        int key = sc.nextInt();
        int result = BinarySear(numbers, key);
        System.out.println("the key is at index: " + result);


    }
}