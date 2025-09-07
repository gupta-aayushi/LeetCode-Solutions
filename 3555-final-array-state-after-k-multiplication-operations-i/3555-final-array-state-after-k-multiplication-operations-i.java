class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i=0; i<k; i++){
            int index = findmin(nums);
            nums[index] = nums[index]*multiplier;
        }
        return nums;
    }
    int findmin(int[] nums){
        int min = nums[0];
        int index = 0;
        for (int i=1; i<nums.length; i++){
            if (min>nums[i]){
                min = nums[i];
                index = i;
            }
        }
        return index;
    }
}