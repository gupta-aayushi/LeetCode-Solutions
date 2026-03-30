class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int k = -1;
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize) {
                if (k == -1 || capacity[i] < capacity[k]) {
                    k = i;
                }
            }
        }
        return k;
    }
}