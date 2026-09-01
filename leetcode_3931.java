class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length-1; i++)
        {
            if(Math.abs(arr[i]-arr[i+1])>2)
            {
                return false;
            }
        }
        return true;
    }
}
