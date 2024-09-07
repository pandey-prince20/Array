public class rainwaterpractice {
    public static int trappedrainwater(int height[])
    {
        int n = height.length;
        //to calculate left max by using array;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i-1]); //math.max used to find maximum of two numbers;
        }
        //to calculate rightmax by using array
        int rightMax[] = new int[n];
         rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--)
        {
           rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //loop for calculating result
        int trappedwater = 0;
        for(int i = 0; i<n; i++)
        {
            //water level = max(leftmax, rightmax);
            int waterlevel = Math.min(rightMax[i], leftMax[i]);
            trappedwater = trappedwater + waterlevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String args[])
    {
        int height[] = {4,2,0,6,3,2,5};
        int result = trappedrainwater(height);
        System.out.println("total trapped water is: " + result);

    }
}
