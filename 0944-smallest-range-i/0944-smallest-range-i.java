class Solution{
    public int smallestRangeI(int[] nums,int k){
        int max=nums[0],min=nums[0];
        for(int num:nums){
            if(num>max)max=num;
            if(num<min)min=num;
        }
        return Math.max((max-k)-(min+k),0);
    }
}
