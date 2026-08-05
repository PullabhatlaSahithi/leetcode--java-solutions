class Solution {
    public boolean isValid(String s) {
        Stack<Character> arr=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                arr.push(ch);
            }
            else 
            {
               if(arr.empty())
               {
                  return false;
               }
               else if(ch==')' && arr.peek()=='(')
               {
                 arr.pop();
               }
               else if(ch=='}' && arr.peek()=='{')
               {
                 arr.pop();
               }
               else if(ch==']' && arr.peek()=='[')
               {
                  arr.pop();
               }
               else
               {
                 return false;
               }
            }

        }
        return arr.empty();
    }
}
