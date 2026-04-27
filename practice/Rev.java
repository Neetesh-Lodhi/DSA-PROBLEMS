class Rev {
           public int reverse(int x) {
        int rev = 0;
        while (x != 0) {  // T.C - O(log10(n)), S.C - O(1)
            int lastDigit = x % 10;
            x = x / 10;

            //  Correct overflow condition (check rev, not x)
            if (rev > Integer.MAX_VALUE / 10 || 
                (rev == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;  // overflow for positive numbers
            }

            if (rev < Integer.MIN_VALUE / 10 || 
                (rev == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;  // overflow for negative numbers
            }

            rev = rev * 10 + lastDigit;
        }

        return rev;
    }
}