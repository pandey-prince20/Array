public class question4 {
    public static int trappedrainwater(int height[])
    {
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--)
        {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int trapeedwater = 0;
        for(int i = 0; i<n; i++)
        {
            int waterlevel = Math.max(leftMax[i], rightMax[i]);
            trapeedwater = trapeedwater + waterlevel - height[i];
        }
        return trapeedwater;
    }
    public static void main(String args[])
    {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedrainwater(height));
        int height1[] = {4,2,0,3,2,5};
        System.out.println(trappedrainwater(height1));
    }
}
