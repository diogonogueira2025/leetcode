class Solution {
    public int[] plusOne(int[] digits) {
        int tam = digits.length;
        digits[tam-1]++;
        
        int vaiUm = 0;

        for (int i = tam - 1; i >= 0; i--) {
            digits[i] += vaiUm;
            
            if(digits[i] == 10) {
                vaiUm = 1;
                digits[i] = 0;
            } else {
                vaiUm = 0;
                break;
            }
        }

        if (vaiUm == 1) {
            int[] digits2 = new int[tam+1];

            digits2[0] = 1;

            for (int i = 0; i < tam; i++) {
                digits2[i+1] = digits[i];
            }

            return digits2;
        }

        return digits;
    }
}