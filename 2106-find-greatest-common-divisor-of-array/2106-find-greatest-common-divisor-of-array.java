class Solution {
    public int findGCD(int[] nums) {
        int l = nums[0];
        int s = nums[0];
        for (int i=1; i<nums.length; i++){
            if (l<nums[i]) l = nums[i];
            if (s>nums[i]) s = nums[i];
        }
        int ans = 1;
        if (l%s==0) return s;
        else {
            for(int i=2; i<s; i++){
                if (s%i==0 && l%i==0){
                    ans = i;
                }
            }
        }
        return ans;
    }
}