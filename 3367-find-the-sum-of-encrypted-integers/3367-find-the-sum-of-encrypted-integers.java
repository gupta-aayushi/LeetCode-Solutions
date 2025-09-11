class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i++){
            sum += encrypt(nums[i]); 
        }
        return sum;
    }
    int encrypt(int n){
        int o = 0;
        int t = 0;
        int h = 0;
        int k = 0;
        if (n<10){
            return n;
        }
        if (n>9 && n<100){
            o = n%10;
            t = n/10;
            return Math.max(o,t)*11;
        }
        if (n>99 && n<1000){
            k = n%100;
            o = k%10;
            t = k/10;
            h = n/100;
            return Math.max(h,Math.max(o,t))*111;
        }
        return 1111;
    }
}