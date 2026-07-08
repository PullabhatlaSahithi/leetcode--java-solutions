class Solution {
    public int nthUglyNumber(int n) {
        int[] arr=new int[n];
        arr[0]=1;
        int i2=0,i3=0,i5=0;
        int next2=1,next3=1,next5=1;
        for(int i=1;i<n;i++)
        {
            next2=arr[i2]*2;
            next3=arr[i3]*3;
            next5=arr[i5]*5;
            int Mini=Math.min(next2, Math.min(next3, next5));
            arr[i]=Mini;
            if(Mini == next2)
               i2++;
            if(Mini == next3)
               i3++;
            if(Mini == next5)
               i5++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i==(n-1))
            {
                return arr[i];

            }
        }

        return 1;    
    }
}
