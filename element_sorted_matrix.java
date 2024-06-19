import java.util.Scanner;

public class element_sorted_matrix {
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       
        int[][] arr = {{1, 4, 6, 8, 10},
                       {2, 7, 9, 12, 15},
                       {3, 11, 20, 22, 24},
                       {5, 16, 25, 30, 40}};

        System.out.println("Enter the target value to search: ");
        int target = scn.nextInt();

        boolean found = searchInMatrix(arr, target);

        if (found) {
            System.out.println("Target found in the matrix!");
        } else {
            System.out.println("Target not found in the matrix.");
        }

        scn.close(); 
    }

    public static boolean searchInMatrix(int[][] arr, int target) {
        //Brute Force Approach
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         if (arr[i][j] == target) {
        //             return true; 
        //         }
        //     }
        // }
        // return false; 

        //Optimization
        int i = 0, j = arr.length - 1;
        while(i< arr.length && j >= 0){
            if(arr[i][j] == target){
                return true;
            }else if(arr[i][j] <  target){
                j++;
            }else{
                j--;
            }
        }

        return false;
    }
}
