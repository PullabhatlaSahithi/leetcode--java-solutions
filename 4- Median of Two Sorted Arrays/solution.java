class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] arr=new int[m+n];
        int i=0,j=0,k=0;
        double med=0.0;
        while(i<m  && j<n)
        {
            if(nums1[i] > nums2[j])
            {
                arr[k]=nums2[j];
                k++;
                j++;
            }
            else
            {
                arr[k]=nums1[i];
                k++;
                i++;
            }

        }
        while(i<m)
        {
            arr[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n)
        {
            arr[k]=nums2[j];
            k++;
            j++;
        } 
        if((arr.length)%2==0)
        {
            med=(arr[(arr.length/2)]+arr[(arr.length/2)-1])/2.0;
        }
        else
        {
            med=arr[arr.length/2];
        }
        return med;

    }
}
