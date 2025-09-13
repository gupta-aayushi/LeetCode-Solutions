class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> str = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            if (str.containsKey(s.charAt(i))){
                str.put(s.charAt(i), str.get(s.charAt(i))+1);
            }
            else{
                str.put(s.charAt(i), 1);
            }
        }
        int maxVowel = 0;
        int maxConsonant = 0;
        for (Map.Entry<Character, Integer> entry : str.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (isVowel(c)) {
                if (count > maxVowel) {
                    maxVowel = count;
                }
            } else {
                if (count > maxConsonant) {
                    maxConsonant = count;
                }
            }
        }
        return maxVowel + maxConsonant;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}