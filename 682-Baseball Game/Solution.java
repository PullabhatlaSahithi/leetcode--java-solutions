class Solution {
    public int calPoints(String[] op) {

        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<op.length;i++)
        {
            String ch=op[i];
            if(!st.empty())
            {
               switch(ch)
               {

                    case "+":int t1=st.pop();
                            int sum=0;
                            sum=sum+(t1+st.peek());
                            st.push(t1);
                            st.push(sum);
                            break;
                    case "D":st.push(st.peek()*2);
                            break;  
                    case "C":st.pop();
                            break;  

                    default: int n=Integer.parseInt(ch);
                             st.push(n);    
                }
            }
            else
            {
                int n=Integer.parseInt(ch);
                st.push(n);
            }
        }
        int total=0;
        while(!st.empty())
        {
            total+=st.pop();
        }
        return total;

        
    }
}
