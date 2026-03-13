import java.util.Arrays;

public class Median {

         
                    // Function to calculate the median of the array
              public void getMedian(int[] arr, int n) {
                              Arrays.sort(arr); // Sort the array to arrange elements in order

                              if (n % 2 == 0) {
                                        // If the array size is even, calculate the average of two middle elements
                                        int ind1 = (n / 2) - 1;
                                        int ind2 = (n / 2);
                                        System.out.println((double) (arr[ind1] + arr[ind2]) / 2); // Return the median
                                                                                                  // for even-sized
                                                                                                  // array
                              } else {
                                        // If the array size is odd, return the middle element
                                        System.out.println(arr[n / 2]);
                              }
                    }
          }

          public class Main {
                    public static void main(String[] args) {
                              int[] arr = { 4, 7, 1, 2, 5, 6 };
                              int n = 6;
                              
                              System.out.print("The median of the array is: ");
                              getMedian(arr, n); // Function call to calculate and print the median
                    }
          }

