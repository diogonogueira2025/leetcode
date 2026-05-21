import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int mod = 0;

        for (int i = 0; i < nums.length; i++) {
            mod = (mod*2 + nums[i])%5;
            result.add(mod == 0);
        }

        return result;
    }
}
