class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();

        for(int num : nums)
        {
            if(num < pivot)
            {
                smaller.add(num);
            }
            else if(num == pivot)
            {
                equal.add(num);
            }
            else
            {
                larger.add(num);
            }
        }

        int ans[] = new int[nums.length];
        int index = 0;
        for(int num : smaller)
        {
            ans[index++] = num;
        }
        for(int num : equal)
        {
            ans[index++] = num;
        }
        for(int num : larger)
        {
            ans[index++] = num;
        }
        return ans;
    }
}
