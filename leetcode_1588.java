class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int len=1; len<=n; len=len+2)
        {
            for(int i=0; i <= n-len; i++)
            {
                for(int j=i; j < i+len; j++)
                {
                    sum = sum+arr[j];
                }
            }
        }
        return sum;
    }
}
