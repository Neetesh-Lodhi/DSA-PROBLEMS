class PlusOne {
          public int[] plusOne(int[] digits) {
                    int n = digits.length;
                    for (int i = n - 1; i >= 0; i--) {
                              if (digits[i] < 9) {
                                        digits[i]++; // normal increment
                                        return digits; // done
                              } else {
                                        digits[i] = 0; // 9 becomes 0 → carry over

                              }
                    }

                    int[] newNumber = new int[n + 1];
                    newNumber[0] = 1;
                    return newNumber;
          }
}