import java.util.*;
public class Arrayintfut{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        marks[0] = sc.nextInt(); //physcs
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //maths
        System.out.println("marks of physcis: " + marks[0]);
        System.out.println("marks of chemistry: "+ marks[1]);
        System.out.println("marks of maths: " + marks[2]);

        marks[2] = marks[2] + 5; //maths marks update
        System.out.println("marks of maths: " + marks[2]);
        //percentage
        int per = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("percentage is :" +per + "%");
        int length = marks.length;
        System.out.println("length of array: " + length);//to get the length of array

        //trying by for loop to input the value;
        for(int i = 3; i<6; i++)
        {
            marks[i] = sc.nextInt();
        }
        for(int i = 3; i<6; i++)
        {
            System.out.println("marks are: " + marks[i]);
        }


    }
}