class Solution {
    public String largestGoodInteger(String num) {
        char prev = 'a';
        int count = 0;
        char maxDigit = ' ';
        for (char c: num.toCharArray()){
            if (c==prev){
                count++;
            }
            else {
                count = 1;
            }
            if (count==3){
                maxDigit = (char)Math.max(c, maxDigit);
            }
            prev = c;
        }
        if (maxDigit == ' '){
            return "";
        }
        StringBuilder ans = new StringBuilder();
        for (int i=1; i<=3; i++){
            ans.append(maxDigit);
        }
        return ans.toString();
    }
}