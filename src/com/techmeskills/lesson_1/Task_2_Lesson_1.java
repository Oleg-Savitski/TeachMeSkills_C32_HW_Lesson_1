package com.techmeskills.lesson_1;

/** В переменной n хранится двузначное число. Создайте программу, вычисляющую и
 * выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
 * (2+6).
 */

public class Task_2_Lesson_1 {
    public static void main(String[] args) {
        int n = 26;
        int a = n / 10;
        int b = n - a * 10;
        int sum = a + b;
        System.out.println("Answer: the sum of the numbers = " + sum);
    }
}
