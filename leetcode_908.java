class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for(int n : nums)
        {
            min = Math.min(min,n);
            max = Math.max(max,n);
        }
        int ans = (max-k) - (min+k);
        return Math.max(0,ans); 
    }
}
