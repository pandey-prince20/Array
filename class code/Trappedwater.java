public class Trappedwater {
    public static int trappedrainwater(int height[])
    {
        int n = height.length;
        //calculate maximum left boundry - using array
        int leftMax[] = new int[n]; //left max calculateed from leeft side
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i-1]); //math max used to find the maximum of given two no
        }
        //calculate right max boundry- using array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];  //right max calculated form right side
        for(int i = n-2; i>=0; i--)
        {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedwater = 0;
        //loop
        for(int i =0; i<n; i++)
        {
            //waterlevel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            //trapped water = waterlevel -height[i];
            trappedwater = trappedwater+waterlevel-height[i];
        }
        return trappedwater;
    
    }
    public static void main(String args[])
    {
        int height[]  = {4,2,0,6,3,2,5};
        System.out.println("Maximum amount of water that can be trapped is:" + trappedrainwater(height));
    }
}
