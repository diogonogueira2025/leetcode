class Solution:
    def myAtoi(self, s: str) -> int:
        INT_MAX_32 = 2**31 - 1
        INT_MIN_32 = -2**31
        found_valid_char = False
        found_minus = False
        found_plus = False
        found_digit = False
        number = 0
        sign = 1

        for char in s:
            if not found_valid_char and char == ' ':
                continue
            found_valid_char = True

            if self.is_digit(char):
                found_digit = True
                digit = int(char) * sign
                if number > (INT_MAX_32 - digit) / 10:
                    number = INT_MAX_32
                    break
                elif number < (INT_MIN_32 - digit) / 10:
                    number = INT_MIN_32
                    break
                number = number * 10 + digit
            elif char == '-':
                if found_minus or found_digit or found_plus:
                    break
                found_minus = True
                sign = -1
            elif char == '+':
                if found_plus or found_digit or found_minus:
                    break
                found_plus = True
            else:
                break

        return number

    def is_digit(self, char: str) -> bool:
        return char >= '0' and char <= '9'