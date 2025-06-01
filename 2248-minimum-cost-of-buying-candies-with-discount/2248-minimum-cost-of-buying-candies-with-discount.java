class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int j = 1;
        for (int i=cost.length-1; i>=0; i--){
            if (j%3!=0){
                sum += cost[i];
            }
            j++;
        }
        return sum;
    }
}