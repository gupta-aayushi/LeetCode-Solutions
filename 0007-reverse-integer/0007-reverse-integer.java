class Solution {
    public int reverse(int x) {
        int ans = 0;
        boolean neg = x<0;
        String str = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(str).reverse();
        try {
            ans = Integer.parseInt(sb.toString());
        }
        catch (NumberFormatException e){
            return 0;
        }
        return neg?-ans:ans;
    }
}