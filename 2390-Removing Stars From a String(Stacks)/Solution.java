class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!='*')
            {
                st.push(ch);
            }
            else
            {
                st.pop();
            }
        }
        for(char ch:st)
        {
            sb.append(ch);
        }
        return sb.toString();
    }
}
