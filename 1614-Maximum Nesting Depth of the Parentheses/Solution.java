class Solution {
    public int maxDepth(String s) {
        int left=0,maxleft=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                left++;
                maxleft=Math.max(maxleft,left);
            }
            else if(ch==')')
            {
                left--;
               
            }
        }
        return maxleft;
    }
}
