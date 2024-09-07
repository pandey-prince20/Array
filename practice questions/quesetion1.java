import java.util.*;
public class quesetion1{
    public static boolean check(int numbers[])
    {
         boolean result = true;
        for(int i = 0; i<numbers.length; i++)
        {
            for(int j = i+1; j<numbers.length; j++)
            {
                if(numbers[i] == numbers[j])
                {
                    result = false;
                    break;
                }
            }
        }
        return result;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int length = sc.nextInt();
        int numbers[] = new int[length];
        System.out.println("enter the digits of array");
        for(int i = 0; i<numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }
        boolean result = check(numbers);
       
        System.out.println("result is : " + result);
          
    }
    
}