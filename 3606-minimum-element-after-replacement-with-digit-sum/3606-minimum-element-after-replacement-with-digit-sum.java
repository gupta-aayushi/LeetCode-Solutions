class Solution {
    public int minElement(int[] nums) {
        for (int i=0; i<nums.length; i++){
            int x=0;
            while (nums[i]>0){
                x = x+ nums[i]%10;
                nums[i]=nums[i]/10;
            }
            nums[i] = x;
        }
        int result = 10001;
        for (int i=0; i<nums.length; i++){
            if (nums[i]<result) {
                result = nums[i];
            }
        }
        return result;
    }
}