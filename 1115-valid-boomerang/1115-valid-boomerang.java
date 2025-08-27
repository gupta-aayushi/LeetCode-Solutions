class Solution {
    public boolean isBoomerang(int[][] points) {
        int x1=0,y1=0,x2=0,y2=0,x3=0,y3=0;
        for (int i=0; i<3; i++){
            for (int j=0; j<2; j++){
                if (i==0&&j==0){
                    x1 = points[i][j];
                }
                if (i==0&&j==1){
                    y1 = points[i][j];
                }
                if (i==1&&j==0){
                    x2 = points[i][j];
                }
                if (i==1&&j==1){
                    y2 = points[i][j];
                }
                if (i==2&&j==0){
                    x3 = points[i][j];
                }
                if (i==2&&j==1){
                    y3 = points[i][j];
                }
            }
        }
        double area = 0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        if (area==0) {
            return false;}
        else {
            return true;}
    }
}