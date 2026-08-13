class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            if(set.contains(num))
            {
                return num;
            }
            else
            {
                set.add(num);
            }
        }
        return -1;
    }
}
