class Solution {
    public int alternatingSum(int[] nums) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i=0; i<nums.length; i++){
            if (i%2==1){
                oddSum += nums[i];
            }
            else {
                evenSum += nums[i];
            }
        }
        return (evenSum-oddSum);
    }
}