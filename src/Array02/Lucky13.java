/*
Given an array of ints,
return true if the array contains no 1's and no 3's.
lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */




package Array02;

public class Lucky13 {
    public static void main(String[] args) {
        int [] myInt = {9,8,4,1};
        System.out.println("Found "+lucky13(myInt));
    }

    public static boolean lucky13(int [] number){
        boolean found = true;
        for (int j : number)
            if (j == 1 || j == 3) {
                found = false;
                break;
            }
        return found;

    }
}
