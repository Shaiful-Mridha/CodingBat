/*
Return the sum of the numbers in the array,
except ignore sections of numbers starting with a 6 and
extending to the next 7 (every 6 will be followed by at least one 7).
Return 0 for no numbers.
sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
 */

package Array02;

public class Sum67 {
    public static void main(String[] args) {
        int[] myInt = {2, 7, 5, 6, 5, 5, 8, 7, 7};
        System.out.println("Sum = " + sum67(myInt));
    }

    public static int sum67(int[] number) {
        int sum = 0;
        int Annu7 = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == 6) {
                for (int j = i; number[j] != 7; j++) {
                    number[j] = 0;
                    Annu7 = j;
                }
                number[Annu7 + 1] = 0;
            } else
                sum = sum + number[i];
        }
        return sum;
    }
}