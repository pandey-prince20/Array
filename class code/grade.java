import java.util.*;
public class Grade{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int math = sc.nextInt();
        int total = phy+chem+math;
        float per = total/3;
        System.out.println("percentage is:" + per + "%");
        if(per>60)
        {
            System.out.println("first grade");
        }
        else if(per<60 && per>45)
        {
            System.out.println("second grade");
        }
        else if(per<45 && per>33)
        {
            System.out.println("third grade");
        }
        else
        {
            System.out.println("fail");
        }
    }
}