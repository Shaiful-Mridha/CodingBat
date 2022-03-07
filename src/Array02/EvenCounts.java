/*
Return the number of even ints in the given array.
Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
*/

package Array02;

public class EvenCounts {
    public static void main(String[] args) {

        int[] myInt = {1, 3, 5};
        System.out.println("Count " + countEvens(myInt));
    }

    public static int countEvens(int[] number) {
        int count = 0;
        for (int num : number) {
            if (num%2 == 0) {
                count++;
            }
        }
        return count;
    }
}