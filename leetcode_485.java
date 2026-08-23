class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int mx = 0;
        for(int ele : nums) {
            if(ele == 1) {
                count++;
                mx = Math.max(mx, count);
            }
            else    count = 0;
        }
        return mx;
    }
}
