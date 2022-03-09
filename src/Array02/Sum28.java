/*
Given an array of ints,
return true if the sum of all the 2's in the array is exactly 8.
sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 */


package Array02;

public class Sum28 {

    public static void main(String[] args) {
        int [] myInt = {2,3,2,2,4,2};
        System.out.println("Found "+ sum28(myInt));

    }

    public static boolean sum28(int[] number) {
        int sum = 0;
        boolean found = false;
        for (int j : number) {
            if (j == 2) {
                sum = sum + 2;
            }
        }
        if (sum == 8) {
            found = true;
        }
        return found;
    }
}