class Solution {
    public boolean isPowerOfTwo(int n) {
        return Math.pow(2, (int) Math.round(Math.log(n)/Math.log(2))) == (double) n;
    }
}