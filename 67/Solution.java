import java.util.Stack;

class Solution {
    public String addBinary(String a, String b) {
        int tamA = a.length();
        int tamB = b.length();

        if (tamA > tamB) {
            b = "0".repeat(tamA-tamB) + b;
        } else if (tamB > tamA) {
            a = "0".repeat(tamB-tamA) + a;
        }

        Stack<Character> stack = new Stack<>();

        boolean carry = false;

        for (int i = a.length() - 1; i >= 0; i--) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);
            char res = '0';

            if(c1 == '0' && c2 == '0') {
                if (carry) {
                    res = '1';
                } 
                carry = false;
            } else if (c1 == '1' && c2 == '1') {
                if (carry) {
                    res = '1';
                }
                carry = true;
            } else {
                if (!carry) {
                    res = '1';
                }
            }
            stack.push(res);
        }
        StringBuilder sb = new StringBuilder();

        if (carry) {
            stack.push('1');
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}