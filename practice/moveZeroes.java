class moveZeroes{


          public static int movezeroes(int[] arr) {
                    int n = arr.length;
                    int count = 0;

                    for (int i = 0; i < arr.length; i++) {
                              if (arr[i] != 0) {
                                        arr[count] = arr[i];
                                        count++;
                              }
                    }

                    while (count < n) {
                              arr[count] = 0;
                              count++;
                    }

                    return count;
          }
          

          public static void main(String[] args) {
                    int[] arr = { 1, 3, 0, 1, 2, 0, 5, 0 };
                    int ans = movezeroes(arr);
                    System.err.println(ans);
          }
}