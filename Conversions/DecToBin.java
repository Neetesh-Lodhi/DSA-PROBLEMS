//“I keep dividing the number by 2 and collect remainders. Reading the remainders in reverse order gives the binary representation.”
// T.C- O(log₂ n)  →  O(log n)

public class DecToBin {
          
          public static void main(String[] args) {
                    int n = 18; // ans is 100010   and for 11 is 1011 
                    int bin = 0;
                    int placeValue = 1;
                    while (n > 0) {
                              int rem = n % 2;
                              bin = bin + rem * placeValue;
                              n = n / 2;
                              placeValue *= 10;
                    }
                    System.out.println(bin); //1010
          }
}
