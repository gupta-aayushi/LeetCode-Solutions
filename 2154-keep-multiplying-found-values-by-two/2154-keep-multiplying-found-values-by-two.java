class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(findoriginal(nums, original)==true){
            original *= 2;
        }
        return original;
    }
    boolean findoriginal(int[] nums, int original){
        for (int i=0; i<nums.length; i++){
            if (nums[i]==original){
                return true;
            }
        }
        return false;
    }
}