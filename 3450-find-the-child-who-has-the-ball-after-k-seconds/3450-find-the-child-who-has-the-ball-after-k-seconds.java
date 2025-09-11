class Solution {
    public int numberOfChild(int n, int k) {
        n--;
        return (k / n & 1) > 0 ? n - k % n : k % n; 
    }
}