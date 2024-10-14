package com.techmeskills.lesson_1;

/** В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
 * на экран результат деления q на w с остатком. Пример вывода программы (для случая,
 * когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
 */

    public static class Task_5_Lesson_1 {
        public static void main(String[] args) {
            int a, b, c;
            a = 11;
            b = 3;
            c = (a % b);
            System.out.println("The remainder of the division of the number " + a + " / " + b + " = " + c);
        }
    }
}
