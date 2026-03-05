class Solution {
    public int strStr(String haystack, String needle) {
        int tam = haystack.length();
        int tam2 = needle.length();
        char n = needle.charAt(0);

        for(int i = 0; i < tam; i++){
            if(tam-i < tam2) return -1;
            
            char c = haystack.charAt(i);

            if(c == n && haystack.substring(i, i + tam2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}