class Solution {
    public int minElement(int[] nums) {
        int[] arr=new int[nums.length];

        for(int i=0;i<nums.length;i++) {
            arr[i]=sum(nums[i]);
        }

        int mini=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++) {
            mini=Math.min(mini,arr[i]);
        }

        return mini;
    }

    public int sum(int n) {
        int sum=0;

        while(n>0) {
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }

        return sum;
    }
}
