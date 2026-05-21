class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k%2 == 0 || k%5 == 0) return -1;

        int length = 0;
        int mod = 0;

        while (length < k) {
            mod = (mod*10 + 1)%k;
            length++;
            
            if (mod == 0) return length;
        }

        return -1;
    }
}
