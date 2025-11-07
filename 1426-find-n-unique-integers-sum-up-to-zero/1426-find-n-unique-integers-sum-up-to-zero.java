class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        if (n==1) {
            arr[0] = 0;
        }
        if (n%2==0){
            for (int i=0; i<n/2; i++){
                arr[i] = i+1;
            }
            for(int i=n/2; i<n; i++){
                arr[i] = 0 - arr[i-(n/2)];
            }
        }
        else {
            arr[0] = 0;
            for (int i=1; i<((n+1)/2); i++){
                arr[i] = i+1;
            }
            for(int i=(n+1)/2; i<n; i++){
                arr[i] = 0 - arr[i-(n/2)];
            }
        }
        return arr;
    }
}