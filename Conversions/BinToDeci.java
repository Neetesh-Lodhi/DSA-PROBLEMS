//✔ Time Complexity: O(number of bits) ≈ O(log n)
// ✔ Space Complexity: O(1)
/*
🟢 Approach I Used

Start from the rightmost digit (least significant bit)

Maintain a variable placeValue initialized to 1 (which is 2⁰)

Extract digits one by one using % 10

Multiply the digit with its place value and add to answer

Double the place value each step (×2)

Repeat until the number becomes 0
*/

public class BinToDeci {
       
          public static void main(String[] args) {
                    int n = 1011; // ans is 11
                    // int temp = n;
                    int ans = 0;
                    int placeValue = 1;
                    while (n != 0) {
                              int ld = n % 10;
                              n = n / 10;
                              ans = ans + ld * placeValue;
                              placeValue =  2 * placeValue;
                    }
                    System.out.println(ans);
          }
}
