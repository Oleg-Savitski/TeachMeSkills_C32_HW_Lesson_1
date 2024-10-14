package com.techmeskills.lesson_1;

/** В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
 * программу, округляющую число n до ближайшего целого и выводящую результат на
 * экран.
 */

public class Task_4_Lesson_1 {
    public static void main(String[] args) {
        double n = 99.56789;
        long a = Math.round(n);
        System.out.println("The nearest round number: " + a);
    }
}
