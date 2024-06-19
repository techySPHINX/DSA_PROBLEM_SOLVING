public class minimum_sorted_unique {
    public static void main(String[] args){
        int[] arr = {14, 15, 202, 22, 3, 5, 7, 9, 11};

        int minElement = findMin(arr);
        System.out.println("Minimum element in the array: " + minElement);
    }
    
    public static int findMin(int[] arr){
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return arr[left];
    }
}
