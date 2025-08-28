class Solution {
    public int smallestIndex(int[] nums) {
        int k = -1;
        for (int i=0; i<nums.length; i++){
            if (digitSum(nums[i])==i){
                k=i;
                break;
            }
        }
        return k;
    }
    public static int digitSum(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}