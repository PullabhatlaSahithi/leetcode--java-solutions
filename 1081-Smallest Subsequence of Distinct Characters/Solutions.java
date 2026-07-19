class Solution {
    public String smallestSubsequence(String s) {
        boolean[] visited=new boolean[26];
        int[] freq=new int[26];
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        } 

        for(char c:s.toCharArray())
        {
            freq[c-'a']--;

            if(visited[c-'a'])
            {
                continue;
            }
            while(!stack.isEmpty() && c<stack.peek() && freq[stack.peek() -'a']>0)
            {
                visited[stack.peek()-'a']=false;
                stack.pop();
            }
            stack.push(c);
            visited[c-'a']=true;
        } 
        StringBuilder sb=new StringBuilder();
        for(char c:stack)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}
