package com.techmeskills.lesson_1;

/** Написать программу которая будет менять местами значение целочисленных
 * переменных. Пример:
 * int a = 1; int b = 2;
 * //код (ваше решение)
 * sout(a); //выведет 2
 * sout(b); //выведет 1
 * Усовершенствовать программу, использовать только 2 входные переменные (a,b).
 */

public class Task_6_Star_Lesson_1 {
    public static void main(String[] args) {
        int a, b;
        a = 1;
        b = 2;
        System.out.println("The number A has become: " + (++a) );
        System.out.println("The number B has become: " + (--b) );

        boolean a1 = false;
        System.out.println("The number A has become: " + a);
        System.out.println("The number B has become: " + b);
    }
}
