class Solution {
    public int maxFreqSum(String s) {
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            arr[c-'a']++;
        }
        int maxConsonant = 0;
        int maxVowel = 0;
        for (int i=0; i<26; i++){
            if (i==0 || i==4 || i==8 || i==14 || i==20){
                if (maxVowel<arr[i]){
                    maxVowel = arr[i];
                }
            }
            else {
                if (maxConsonant<arr[i]){
                    maxConsonant = arr[i];
                }
            }
        }
        return maxVowel + maxConsonant;
    }    
}