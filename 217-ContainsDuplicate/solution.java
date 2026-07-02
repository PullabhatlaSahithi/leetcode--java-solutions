class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean count=false;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                count=true;
                break;
            }
            set.add(nums[i]);
        }
        return count; 
    }
}
