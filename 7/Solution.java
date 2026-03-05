class Solution {
    public int reverse(int x) {
        int n = (x > 0) ? x : -x;

        int aux = 0;

        while(n > 0){
            if(aux > Integer.MAX_VALUE/10){
                return 0;
            }

            aux = aux*10 + n%10;
            n = n/10;
        }

        return (x > 0) ? aux : -aux;
    }
}