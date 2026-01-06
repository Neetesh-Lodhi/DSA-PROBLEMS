//add 6 at beginning
//add 7 at the end
//add 8 at 4 index (8,4)

import java.util.*;

class Main {

    public static void addElements(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        list.add(0, 6);
        list.add(7);
        list.add(4, 8);

        for (int num : list) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        addElements(arr);
    }
}
