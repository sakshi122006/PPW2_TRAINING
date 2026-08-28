import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // Mark numbers that appear
        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            // Make the value negative to mark it as seen
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Numbers whose positions are still positive are missing
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
