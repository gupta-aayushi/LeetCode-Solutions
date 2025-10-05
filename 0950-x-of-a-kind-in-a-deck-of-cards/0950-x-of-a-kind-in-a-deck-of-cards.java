class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int card : deck) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        int gcdValue = 0;
        for (int freq : countMap.values()) {
            gcdValue = gcd(gcdValue, freq);
        }

        return gcdValue >= 2;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}