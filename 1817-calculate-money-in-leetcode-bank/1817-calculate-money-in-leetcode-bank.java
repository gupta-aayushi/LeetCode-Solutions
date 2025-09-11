class Solution {
    public int totalMoney(int n) {
        int moncount = 0;
        int sum = 0;
        for (int i=1; i<=n; i++){
            if (i%7==1){
                moncount++;
                sum += moncount;
            }
            else if (i%7==0) {
                sum += 7 + moncount - 1;
            }
            else {
                sum += i%7 + moncount - 1;
            }
        }
        return sum;
    }
}