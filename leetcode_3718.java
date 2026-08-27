class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++)    set.add(nums[i]);

        int i = 1;
        while (true) {
            int mult = k * i;
            if(!set.contains(mult))     return mult;
            i++;
        }
    }
}
