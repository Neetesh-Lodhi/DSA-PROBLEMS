public class secondMax {
          
          public static int findSecMax(int[] arr) {
                    int max = Integer.MIN_VALUE;//-2147483648
                    int secondMax = Integer.MIN_VALUE; 
                    for (int i = 0; i < arr.length; i++) {
                              if (arr[i] > max) {
                                        secondMax = max;
                                        max = arr[i];
                              } else if (arr[i] > secondMax && arr[i] != max) {
                                        secondMax = arr[i];
                              }
                    }

                    return secondMax;

          }

          public static void main(String[] args) {
                    int[] arr = { 20, 30, 40, 50, 60,45455 };
                    System.out.println(findSecMax(arr));
    }    
}
