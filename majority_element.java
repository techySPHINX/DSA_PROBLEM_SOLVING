public class majority_element {
    // brute-force-approach
    
    public static int findMajorityElement(int[] arr) {
        int candidate = -1;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Verification step: Check if the candidate is indeed the majority element
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return (count > arr.length / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 1, 5 };
        int majorityElement = findMajorityElement(arr);

        if (majorityElement != -1) {
            System.out.println("Majority element: " + majorityElement);
        } else {
            System.out.println("No majority element found");
        }
    }
}
