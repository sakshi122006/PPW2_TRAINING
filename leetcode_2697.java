class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            if(arr[left]!= arr[right])
            {
                if(arr[left]>arr[right])
                {
                    arr[left]=arr[right];
                }
                else
                {
                    arr[right]=arr[left];
                }
            }
            left++;
            right--;
        }
        return new String(arr);
    }
}
