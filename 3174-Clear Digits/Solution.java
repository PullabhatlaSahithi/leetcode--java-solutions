class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           if(ch=='0'||ch=='1'|| ch=='2'|| ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
           {
                st.pop();
           }
           else
           {
              st.push(ch);
           }
        }
        for(char ch:st)
        {
            sb.append(ch);
        }
        return sb.toString();  
    }
}
