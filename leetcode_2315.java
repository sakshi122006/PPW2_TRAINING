class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean inside = false;
        for(char c : s.toCharArray())
        {
            if(c=='|')
            {
                inside = !inside;
            }
            else if(c=='*' && !inside)
            {
                count++;
            }
        }
        return count;
    }
}
