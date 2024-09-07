//array is a call by reference method
// //it means the actual array will be changed in this function
// the values under the main functions will be also get changed when we update the value by user defined function.
import java.util.*;
public class Arrayargument{
    public static void arrayupdate(int marks[], int num)
    {
        num = num+1;
        for(int i =0; i<marks.length; i++)
        {
            marks[i] = marks[i] +1;
        }
    }
    public static void main(String args[])
    {
        int marks[] = {97,98,99};
        int num = 89;
        arrayupdate(marks, num); //marks updated
        System.out.println(num); //value doesnt change (because in num call by values operates)
        for(int i = 0; i<marks.length; i++)
        {
            System.out.println(marks[i]);  //printing updated marks values
        }


    }
}