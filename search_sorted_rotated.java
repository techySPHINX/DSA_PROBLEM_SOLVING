import java.util.Scanner;

public class search_sorted_rotated {

    public static void main(String[] args){
        int[] nums = {9, 11, 14, 15, 20, 22, 25, 2, 3, 5, 7};
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the target value to search: ");
        int target = scn.nextInt();

        int miniIdx = findMin(nums);  

        int ans = BinarySearch(nums, 0, miniIdx - 1, target); 

        if (ans == -1) {
            ans = BinarySearch(nums, miniIdx, nums.length- 1, target);
        };
        System.out.println(ans);

        scn.close(); 
    }

    public static int BinarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
