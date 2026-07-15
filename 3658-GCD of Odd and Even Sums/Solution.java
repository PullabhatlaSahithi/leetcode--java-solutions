class Solution {
    public int gcdOfOddEvenSums(int n) {
        int count_odd=0,count_even=0;
        int sum_odd=0,sum_even=0;
        for(int i=1;i<n || (count_odd<n && count_even<n);i++)
        {
            if(i%2==0)
            {
                sum_even+=i;
                count_even++;
            }
            if(i%2!=0)
            {
                sum_odd+=i;
                count_odd++;
            }
        }
        return gcd(sum_odd,sum_even); 
    }
    public int gcd(int a,int b)
    {
        return b==0? a : gcd(b,a%b);
    }
}
