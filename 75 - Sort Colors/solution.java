class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        ArrayList<Integer> li=new ArrayList<>(map.keySet());
        Collections.sort(li);

        int index=0;
        for(int i=0;i<li.size();i++)
        {
            int key=li.get(i);
            int freq=map.get(key);
            while(freq-->0)
            {
                nums[index++]=key;
            }
        } 
    }
}
