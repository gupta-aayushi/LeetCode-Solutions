class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int y = x;
        int ans = -1;
        int sum = 0;
        if (x<10) {
            return x;
        }
        while (x>0) {
            sum = sum + x%10;
            x = x/10;
        }
        if (y%sum==0) {
            ans = sum;
        }
        return ans;
    }
}