class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            // a already maps to something different
            if (mapST[a] != 0 && mapST[a] != b) {
                return false;
            }

            // b is already mapped from a different character
            if (mapTS[b] != 0 && mapTS[b] != a) {
                return false;
            }

            mapST[a] = b;
            mapTS[b] = a;
        }

        return true;
    }
}
