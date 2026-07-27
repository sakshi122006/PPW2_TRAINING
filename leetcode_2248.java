class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        int count[] = new int[1001];
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[i].length; j++)
            {
                count[nums[i][j]]++;
            }
        }
        for(int i=1; i<=1000; i++)
        {
            if(count[i]==nums.length)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}
