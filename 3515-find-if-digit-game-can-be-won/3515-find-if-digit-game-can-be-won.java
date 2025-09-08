class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumsingle = 0;
        int sumdouble = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]<10){
                sumsingle += nums[i];
            }
            else {
                sumdouble += nums[i];
            }
        }
        if (sumsingle>sumdouble || sumsingle<sumdouble){
            return true;
        }
        else {
            return false;
        }
    }
}