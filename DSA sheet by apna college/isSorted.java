public class isSorted {
        public static boolean isSorted(int[] arr) { //check in increasing order
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(isSorted(arr));

    }  
}
