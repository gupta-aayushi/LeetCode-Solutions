class Solution {
    public int countDigits(int num) {
        int count = 0;
        int d = num;
        while (d>0){
            int x = d%10;
            if (num%x==0){
                count++;
            }
            d = d/10;
        }
        return count;
    }
}