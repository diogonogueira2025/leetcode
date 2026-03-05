import java.util.Set;
import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 0;
        int aux = -101;

        for(int n : nums){
            if(n > aux){
                nums[i++] = n;
            }

            aux = n;
        }   

        return i;
    }
}