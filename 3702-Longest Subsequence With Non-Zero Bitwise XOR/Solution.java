class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
        }
        if(xor!=0)
        {
            return nums.length;
        }
        boolean found=false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                found=true;
            }
        }
        if(found==false)
        {
            return 0;
        }
        return nums.length-1;
    }
}
