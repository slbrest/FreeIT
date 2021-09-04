package Homeworks;

import java.util.Scanner;

public class HWLesson2 {
    //раскоментируйте нужный метод для проверки
    public static void main(String[] args) {
        //  unambiguous();
        // triangle(3,1,1);
        //positive();
        // howPositiveNumbers();
        howPositiveNegativeNumbers();
    }

    /*1. В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
    Например, "это однозначное положительное число". Достаточно будет определить, является ли число однозначным,
    "двухзначным или трехзначным и более.*/

    //Воод числа при помощи Scanner.
    public static void unambiguous() {
        int number = new Scanner(System.in).nextInt();
        if (number >= 0 && number < 10) {
            System.out.println(number + " Это однозначное положительное число");
        }
        if (number < 0 && -10 < number) {
            System.out.println(number + " Это однозначное отрицательное число");
        }
        if (number >= 10 && number < 100) {
            System.out.println(number + " Это двузначное положительное число");
        }
        if (number <= -10 && -100 < number) {
            System.out.println(number + " Это двузначное отрицательное число");
        }
        if (number >= 100) {
            System.out.println(number + " Это трехзначное или более положительное число ");
        }
        if (number <= -100) {
            System.out.println(number + " Это трехзначное или более отрицательное число");
        }
    }

    /*2) Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей. Определить существует
    ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника. Требуется сравнить длину каждого
    отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок окажется больше суммы двух других,
    то треугольника с такими сторонами не существует.*/

    public static void triangle(int a, int b, int c) {
        if (a + b < c || b + c < a || a + c < b)
            System.out.println("треугольника с такими сторонами не существует");
        else
            System.out.println("треугольник существует");
    }

    /*3) Дано целое число. Если оно является положительным, то прибавить к нему 1.Если отрицательным, то вычесть из него
     2. Если нулевым, то заменить его на 10. Вывести полученное число */

    //Воод числа при помощи Scanner.
    public static void positive() {
        int number = new Scanner(System.in).nextInt();
        if (number > 0 && number != 0) {
            number++;
            System.out.println(number);
        }
        if (number < 0 && number != 0) {
            number = number + 2;
            System.out.println(number);
        }
        if (number == 0) {
            number = 10;
            System.out.println(number);
        }
    }

    //4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

    public static void howPositiveNumbers() {
        int positiveNumbers = 0;
        for (int i = 0; i < 3; i++) {
            int number = new Scanner(System.in).nextInt();
            if (number >= 0)
                positiveNumbers++;
        }
        System.out.println("Положительных " + positiveNumbers);
    }

    // 5) Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.

    public static void howPositiveNegativeNumbers() {
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        for (int i = 0; i < 3; i++) {
            int number = new Scanner(System.in).nextInt();
            if (number >= 0)
                positiveNumbers++;
            if (number < 0)
                negativeNumbers++;
        }
        System.out.println("Положительных " + positiveNumbers);
        System.out.println("Отрицательных " + negativeNumbers);
    }
    //6) Даны 2 числа. Вывести большее из них





    /*
7)  В переменную записываете количество программистов. В зависимости от количества программистов необходимо вывести правильно окончание. Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
8)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой суммарный путь пробежит спортсмен за 7 дней?
9)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
10)Вычислить: 1+2+4+8+...+256
11)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
12)Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
13)Напишите программу вывода всех четных чисел от 2 до 100 включительно
14)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99

    */

}
