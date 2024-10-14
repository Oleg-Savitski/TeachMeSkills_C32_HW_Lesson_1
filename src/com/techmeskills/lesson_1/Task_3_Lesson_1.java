package com.techmeskills.lesson_1;

/** В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
 * выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
 * 9 (1+2+6).
 */

public class Task_3_Lesson_1 {
    public static void main(String[] args) {
        int n, a, b, c, sum;
        n = 111;
        a = n / 100;
        b = (n / 10) % 10;
        c = n % 10;
        sum = a + b + c;
        System.out.println("The sum of the digits of the three-digit number 111 = " + sum);
    }
}
