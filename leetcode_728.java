class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int num = i;
            boolean valid = true;
            for (int j = 0; num > 0; j++) {
                int n = num % 10;
                if (n == 0) {
                    valid = false;
                    break;
                }
                if (i % n != 0) {
                    valid = false;
                    break;
                }
                num = num / 10;
            }
            if (valid) {
                ans.add(i);
            }
        }
        return ans;
    }
}
