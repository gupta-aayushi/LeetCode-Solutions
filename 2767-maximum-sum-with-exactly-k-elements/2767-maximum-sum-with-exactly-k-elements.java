class Solution {
    public int maximizeSum(int[] nums, int k) {
        int maxelement = nums[0];
        for (int i=1; i<nums.length; i++){
            if (maxelement<nums[i]){
                maxelement = nums[i];
            }
        }
        int sum = maxelement;
        for (int i=1; i<k; i++){
            sum += maxelement + i;
        }
        return sum;
    }
}