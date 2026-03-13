
public class xyz {

    public static void duplicate(int[] nums) {
        int n = nums.length;
        int ans = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[ans] = nums[i];
                ans++;

            }
        }

        System.out.println("length of unique elements of array : " + ans);
        for (int i = 0; i < ans; i++) {
            System.out.print(nums[i] + " ");
        }
System.out.println();
    }
    
    

  

    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3};
        duplicate(nums);

    }
}
