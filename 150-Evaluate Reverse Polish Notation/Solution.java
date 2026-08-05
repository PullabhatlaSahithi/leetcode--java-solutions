class Solution {
    public int evalRPN(String[] tokens) {

        Stack<String> st=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
     if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/"))
            {
                st.push(tokens[i]);
            }
            else
            { 
                    int c=Integer.parseInt(st.peek());
                    st.pop();
                    int d=Integer.parseInt(st.peek());
                    st.pop();
                    if(tokens[i].equals("+"))
                    {
                        st.push(String.valueOf(d + c));
                    }
                    else if(tokens[i].equals("-"))
                    {
                        st.push(String.valueOf(d - c));
                    }
                    else if(tokens[i].equals("*"))
                    {
                        st.push(String.valueOf(d * c));
                    }
                    else if(tokens[i].equals("/"))
                    {
                        st.push(String.valueOf(d / c));
                    }
                
            }
        }
        return Integer.parseInt(st.peek());  
    }
}
