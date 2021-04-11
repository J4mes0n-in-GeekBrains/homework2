//
// Created by Glazyrin Maksim
//

package geekbrains_lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(within10and20(15, 15));
        isPositiveOrNegative(0);
        System.out.println(isNegative(0));
        printWordNTimes("word",5);
    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if ((sum <= 20) && (sum >= 10)) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean isNegative(int c) {
        if (c >= 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
}
