class Solution {
    public List<String> buildArray(int[] target, int n) 
    {
        int num=1;
        List<String> list=new ArrayList<>();
        for(int i=0;i<target.length && num<=n;i++)
        {
            while(target[i]!=num)
            {
                list.add("Push");
                list.add("Pop");
                num++;
            }
                list.add("Push");
                num++;
        }
        return list;
    }
}
