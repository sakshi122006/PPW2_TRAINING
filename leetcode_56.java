import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Sort intervals by starting time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Store merged intervals
        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {

            // No overlap
            if (merged.isEmpty() ||
                merged.get(merged.size() - 1)[1] < interval[0]) {

                merged.add(interval);

            } else {

                // Overlap: extend the ending time
                merged.get(merged.size() - 1)[1] =
                    Math.max(
                        merged.get(merged.size() - 1)[1],
                        interval[1]
                    );
            }
        }

        // Convert List<int[]> to int[][]
        return merged.toArray(new int[merged.size()][]);
    }
}
