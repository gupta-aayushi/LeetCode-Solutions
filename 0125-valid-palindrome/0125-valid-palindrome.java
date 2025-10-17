class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "");
        s = s.replaceAll("\\p{Punct}", "");
        s = s.toLowerCase();
        if (s.isEmpty()){
            return true;
        }
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}