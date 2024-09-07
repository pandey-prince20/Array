import java.util.*;
public class LinearSearch{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int num[] = new int[10];
    for(int i = 0; i<10; i++)
    {
        num[i] = sc.nextInt();  //input the array
    }
    int search = sc.nextInt(); //value to search
    int flag =0;
    for(int i=0; i<10; i++)
    {
        if(search == num[i])
        {
            flag++;
            break;
        }

    }
    if(flag == 1)
    {
        System.out.println(search + "is found");
    }
    else
    {
        System.out.println(search + "is not found");
    }

}
}