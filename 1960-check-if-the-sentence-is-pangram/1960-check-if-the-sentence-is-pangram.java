class Solution {
    public boolean checkIfPangram(String sentence) {
        /*HashMap <Character,Integer> map = new HashMap<>();
        for (int i=0; i<sentence.length(); i++) {
            map.put(sentence.charAt(i), map.getOrDefault(sentence.charAt(i),0)+1);
        }
        if(map.size()==26) {
            return true;
        }
        return false;*/
        int[] arr = new int[26];
        for (int i=0; i<sentence.length(); i++) {
            arr[sentence.charAt(i)-'a']++;
        }
        for (int i=0; i<arr.length; i++) {
            if(arr[i]<1) {
                return false;
            }
        }
        return true;
    }
}