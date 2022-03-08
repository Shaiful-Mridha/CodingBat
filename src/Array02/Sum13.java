/*
Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky,
so it does not count and numbers that
come immediately after a 13 also do not count.
sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
 */


package Array02;

public class Sum13 {
    public static void main(String[] args) {
        int[] myInt = {13, 5, 13};
        System.out.println("Sum = " + sum13(myInt));

    }

    public static int sum13(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 13) {
                sum += num[i];
                if (i > 0 && num[i - 1] == 13)
                    sum = sum - num[i];
            }

        }
        return sum;
    }

}
