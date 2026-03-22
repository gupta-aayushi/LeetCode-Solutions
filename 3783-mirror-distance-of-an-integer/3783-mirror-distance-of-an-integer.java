class Solution {
    public int mirrorDistance(int n) {
        if (n<=9) {
            return 0;
        }
        return Math.abs(n-reverse(n));
    }
    public int reverse(int n){
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb = sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}