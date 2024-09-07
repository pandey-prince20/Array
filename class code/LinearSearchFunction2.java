import java.util.*;
public class LinearSearchFunction2{
    public static int stringsearch(String menu[], String food) //function to searchstring
    {
        int i;
        for(i=0; i<menu.length; i++)
        {
            if(menu[i] == food)
            {
                return 1;
            }
        
        }
        return -1;
    }
    public static int linersearc(int number[], int search)
    {
        int i;
        for(i=0; i<number.length; i++)
        {
            if(number[i] == search)
            {
                return i;

            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[10];
        int i;
        System.out.println("enter the numbers:");
        for(i = 0; i<number.length; i++)
        {
            number[i] = sc.nextInt();
        }
        System.out.print("enter the value to search:");
        int search = sc.nextInt();
        int index = linersearc(number, search);
        System.out.println("index: " + index);
        if(index == -1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("index is:" + index);
        }
        //program for searching food in menu
        String menu[] = {"dosa", "itli", "daal", "chawal", "bhatura","sabji"};
        String food = "daal";
        int indexfood = stringsearch(menu, food);
        if(indexfood == -1)
        {
            System.out.println("food not present in menu");
        }
        else
        {
            System.out.println("food is present at index:" + indexfood);
        }
        

    }
    
}