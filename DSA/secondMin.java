public class SecondMin {
        

        public static int secondMinimum(int[] arr, int n) {
            int min = Integer.MAX_VALUE;
            int secMin = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (arr[i] < min) {
                    secMin = min;
                    min = arr[i];

                }
                if (arr[i] < secMin && arr[i] != min) {
                    secMin = arr[i];
                }
            }
            return secMin;
        }

        public static void main(String[] args) {

            int arr[] = {6, 7, 1, 2};

            System.out.println(secondMinimum(arr, arr.length));
        }
    }

