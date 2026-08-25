class Solution {
    public int missingMultiple(int[] nums, int k) 
    {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],true);
        }
        for(int i=k;;i+=k)
        {
            if(!map.containsKey(i))
            {
                return i;
            }
        }
    }
}
