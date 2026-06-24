/*
Problem: Spiral Matrix (LeetCode 54)

Intuition:
Use four boundaries (top, bottom, left, right)
and traverse the matrix layer by layer.

Approach:
1. Traverse top row
2. Traverse right column
3. Traverse bottom row
4. Traverse left column
5. Shrink boundaries

Time Complexity: O(m*n)
Space Complexity: O(m*n)
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0,bottom=n-1;
        int left=0,right=m-1;
        List<Integer> arr=new ArrayList<>();
     while(top<=bottom && left<=right)
     {
        for(int i=left;i<=right;i++)
        {
            arr.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
            arr.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom)
        {
           for(int i=right;i>=left;i--)
           {
            arr.add(matrix[bottom][i]);
           }
            bottom--;
        }
       if(left<=right)
       {
           for(int i=bottom;i>=top;i--)
           {
            arr.add(matrix[i][left]);
           }
        left++;
       }
      }
      return arr;
    }
}
