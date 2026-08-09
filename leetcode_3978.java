class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int middle = nums[nums.length/2];
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==middle)
            {
                count++;
            }
        }

        return count==1;
    }
}
