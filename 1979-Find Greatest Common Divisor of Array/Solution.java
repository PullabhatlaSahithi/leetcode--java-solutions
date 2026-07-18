class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        return gcd(max,min); 
    }
    public int gcd(int a,int b)
    {
        return b==0?a:gcd(b,a%b);
    }
}
