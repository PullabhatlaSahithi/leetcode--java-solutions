class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum=0,max=0;
        int rem1_1=Integer.MAX_VALUE;int rem1_2=Integer.MAX_VALUE;
        int rem2_1=Integer.MAX_VALUE;int rem2_2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(nums[i]%3==1)
            {
                if(nums[i]<rem1_1)
                {
                    rem1_2=rem1_1;
                    rem1_1=nums[i];
                }
                else if(nums[i]<rem1_2)
                {
                    rem1_2=nums[i];
                }
                else
                {
                    continue;
                }
            }
            if(nums[i] % 3 == 2)
            {
                if(nums[i]<rem2_1)
                {
                    rem2_2=rem2_1;
                    rem2_1=nums[i];
                }
                else if(nums[i]<rem2_2)
                {
                    rem2_2=nums[i];
                }
                else
                {
                    continue;
                }
            }
        }
            if(sum % 3 == 0)
            {
                return sum;
            }
            int ans=0,rem=sum%3;
            if(rem == 1)
            {
                if(rem1_1 != Integer.MAX_VALUE)
                {
                    ans=Math.max(ans,sum-rem1_1);
                }
                if(rem2_1 != Integer.MAX_VALUE  && rem2_2 != Integer.MAX_VALUE )
                {
                    ans=Math.max(ans,sum-rem2_1-rem2_2);
                }
            }
            else
            {
                if(rem2_1 != Integer.MAX_VALUE)
                {
                    ans=Math.max(ans,sum-rem2_1);
                }
                if(rem1_1 != Integer.MAX_VALUE  && rem1_2 != Integer.MAX_VALUE )
                {
                    ans=Math.max(ans,sum-rem1_1-rem1_2);
                }

            }
            return ans;

        
    }
    
}
