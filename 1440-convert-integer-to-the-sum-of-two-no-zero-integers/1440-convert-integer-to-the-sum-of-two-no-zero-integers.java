class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = 0, b = 0, tens = 1;
        
        while (n > 0) {
            int d = n % 10;
            if (d == 0) {
                a += 5 * tens;
                b += 5 * tens;
                n -= 10; 
            } else if (d == 1 && n >= 10) {
                a += 6 * tens;
                b += 5 * tens;
                n -= 10; 
            } else {
                a += (d - d / 2) * tens;
                b += (d / 2) * tens;
            }
            
            n /= 10;
            tens *= 10;
        }
        
        return new int[]{a, b};
    }
}
