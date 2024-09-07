
import java.util.Arrays;
public class DecendingWithBubble{
    //prgram to sort the array in decending order using bubblle Sort
    public static void decendingbubblesort(int array[])
    {
        for(int i = 0; i<array.length; i++)
        {
            for(int j = i+1; j<array.length; j++)
            {
                if(array[i]<array[j])       //swapping in decending order
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    // program to sort in decending order  in the given  array by using selection sort
    public static void decendingSelectionSort(int array[])
    {
        for(int i = 0; i<array.length; i++)
        {
            int minpos = i;
            for(int j = i+1; j<array.length; j++)
            {
                if(array[minpos]<array[j])
                {
                    minpos = j;    //finding the index of grestest no in the given array
                }
            }
            int temp = array[i];
            array[i] = array[minpos];
            array[minpos] = temp;
        }
    }
    //program for sorting using countingsort
    public static void decendingCountingSort(int array[])
    {
        int n = array.length + 1;
        int count[] = new int[n];
        for(int i = 0; i<array.length; i++)
        {
            count[array[i]]++;
        }
        int j = 0;
        for(int i = 0; i<count.length; i++)
        {
            while(count[i]>0)
            {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    //using inbuilt sort
    public static void inbuiltsort(int array[])
    {
        Arrays.sort(array);
    }
    public static void printArray(int array[])
    {
        for(int i = 0; i<array.length; i++)
        {
            System.out.print(array[i]+", ");
        }
    }
    public static void main(String args[])
    {
        int array[] = {3,6,2,1,8,7,4,5,3,1};
        //decendingbubblesort(array);
       // decendingSelectionSort(array);
        //decendingCountingSort(array);
        inbuiltsort(array);
        printArray(array);

    }
}