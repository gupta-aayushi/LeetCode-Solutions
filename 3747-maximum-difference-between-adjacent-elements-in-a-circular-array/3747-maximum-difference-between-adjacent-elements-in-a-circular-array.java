class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int result = Math.abs(nums[0] - nums[nums.length-1]);
        for (int i=1; i<nums.length; i++){
            if (Math.abs(nums[i]-nums[i-1])>result){
                result = Math.abs(nums[i]-nums[i-1]);
            }
        }
        return result;
    }
}