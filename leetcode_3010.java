class Solution {
    public int minimumCost(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i=1; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                ans =  Math.min(ans,nums[0]+nums[i]+nums[j]);
            }
        }
        return ans;
    }
}
