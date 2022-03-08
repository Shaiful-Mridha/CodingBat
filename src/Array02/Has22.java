/*
Given an array of ints,
return true if the array contains a 2 next to a 2 somewhere.
has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
 */


package Array02;

public class Has22 {
    public static void main(String[] args) {
        int[] myInt = {2, 2, 1, 2};
        System.out.println("Array " + has22(myInt));
    }

    public static boolean has22(int[] number) {
        boolean found = false;
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] == 2) {
                if (number[i + 1] == 2) {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }
}