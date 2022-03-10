/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */

package Array02;
public class More14 {
    public static void main(String[] args) {
        int[] myInt = {1, 4, 1};
        System.out.println("array " + more14(myInt));

    }

    public static boolean more14(int[] number) {
        int count1 = 0;
        int count4 = 0;
        boolean isTrue = false;
        for (int j : number) {
            if (j == 1)
                count1++;
            if (j == 4)
                count4++;
        }
        if (count1 > count4)
            isTrue = true;
        return isTrue;
    }

}
