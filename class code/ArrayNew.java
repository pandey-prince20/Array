import java.util.*;
 public class ArrayNew {
    public static void main(String args[])
    {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        System.out.println(marks[0]);
        System.out.println("length of array " + marks.length);
    }
 }