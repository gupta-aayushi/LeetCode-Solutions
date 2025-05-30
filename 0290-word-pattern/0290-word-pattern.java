class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (!map.containsKey(c)) {
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(c, word);
            } else {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            }
        }
        return true;
    }
}
