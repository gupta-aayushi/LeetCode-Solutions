class Solution {
    public int[] transformArray(int[] nums) {
        int counteven = 0;
        int countodd = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]%2==0){
                counteven++;
            }
        }
        countodd = nums.length - counteven;
        for (int i=0; i<counteven; i++){
            nums[i] = 0;
        }
        for (int i=counteven; i<nums.length; i++){
            nums[i] = 1;
        }
        return nums;
    }
}