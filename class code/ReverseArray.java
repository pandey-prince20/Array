import java.util.*;
public class ReverseArray{
    public static void reverse(int array[])
    {
        int first= 0; int last = array.length-1;
        while( first < last)
        {
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        for( int i =0; i < array.length; i++)
        {
            array[i] = sc.nextInt();     //array input
        }
        //int array[] = { 1,2,3,4,5};
        reverse(array);
        System.out.print("{ ");
        for( int i = 0; i<array.length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print("}");
    }
}