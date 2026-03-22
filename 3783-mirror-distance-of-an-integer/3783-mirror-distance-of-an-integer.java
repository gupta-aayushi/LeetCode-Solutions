class Solution {
    public int mirrorDistance(int n) {
        if (n<=9) {
            return 0;
        }
        return Math.abs(n-reverse(n));
    }
    public int reverse(int n){
        int k = 0;
        while(n!=0){
            k = (k*10)+n%10;
            n = n/10;
        }
        return k;
    }
}