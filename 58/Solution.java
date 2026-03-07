class Solution {
    public int lengthOfLastWord(String s) {
        char[] letras = s.toCharArray();
        int tam = letras.length;

        int count = 0;

        for (int i = tam - 1; i >= 0; i--) {
            if(letras[i] != ' ') {
                count++;
            } else if (count > 0) {
                break;
            }
        }
        
        return count;
    }
}