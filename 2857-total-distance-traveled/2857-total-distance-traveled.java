class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int x=0, y=mainTank;
        while (y>=5 && additionalTank>0){
            y = y-5;
            x++;
            additionalTank--;
            y++;
        }
        int result = (mainTank+x)*10;
        return result;
    }
}