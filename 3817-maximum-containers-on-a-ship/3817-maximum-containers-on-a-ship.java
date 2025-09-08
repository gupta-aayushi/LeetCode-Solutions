class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int n2 = n*n;
        int i = 0;
        int count = 0;
        while (maxWeight>=w && i<n2){
            count++;
            i++;
            maxWeight -= w;
        }
        return count;
    }
}