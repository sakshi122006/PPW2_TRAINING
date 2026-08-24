class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                // Put 0 at the beginning
                swap(nums, low, mid);
                low++;
                mid++;

            } else if (nums[mid] == 1) {
                // 1 is already in the correct middle region
                mid++;

            } else {
                // Put 2 at the end
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
