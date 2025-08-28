class Solution {
    public boolean canAliceWin(int n) {
        if (n<10){
            return false;
        }
        int i = 10;
        int count=0;
        int x = n;
        while (x>=i){
            x = x - i;
            i--;
            count++;
        }
        if (count%2==0){
            return false;
        }
        else {
            return true;
        }
    }
}