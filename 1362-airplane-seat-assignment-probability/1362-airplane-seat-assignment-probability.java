class Solution {
    public double nthPersonGetsNthSeat(int n) {
        double prob=0;
        if (n==1){
            prob = 1;
        }
        else{
            prob = 0.5;
        }
        return prob;
    }
}