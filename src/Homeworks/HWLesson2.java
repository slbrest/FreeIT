package Homeworks;

import java.util.Scanner;

public class HWLesson2 {
    //раскоментируйте нужный метод для проверки
    public static void main(String[] args) {
        //unambiguous();
        //triangle(3,1,1);
        //positive();
        //howPositiveNumbers();
        //howPositiveNegativeNumbers();
        //twoNumbers();
        //programmers();
        //eaSportsItIsInTheGame();
        //amoeba();
        //sum();
        //withoutMultiplication();
        //inch();
        //even();
        //notEven();
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

    public static void twoNumbers() {
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();
        if (x > y)
            System.out.println(x);
        else
            System.out.println(y);
    }

    /*7)  В переменную записываете количество программистов. В зависимости от количества программистов необходимо
    вывести правильно окончание. Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.*/

    public static void programmers() {
        int number = new Scanner(System.in).nextInt();
        if (number == 1)
            System.out.println(number + " програмист");
        if (number > 1 && number < 5)
            System.out.println(number + " програмиста");
        if (number == 0 || number >= 5)
            System.out.println(number + " програмистов");
    }

    /*8)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную норму на 10% нормы
    предыдущего дня. Какой суммарный путь пробежит спортсмен за 7 дней? */

    public static void eaSportsItIsInTheGame() {
        int man = 10;
        int whil = 0;
        double result = man;
        while (whil < 7) {
            result = (result * 0.1) + result;
            whil++;
        }
        System.out.println(result);
    }

    //9)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,.., 24 часа.

    public static void amoeba() {
        int amoeba = 1;
        int whil = 0;
        int result = amoeba;
        while (whil < 24) {
            result = result * 2;
            whil = whil + 3;
        }
        System.out.println(result);
    }

    //10)Вычислить: 1+2+4+8+...+256

    public static void sum() {
        int sum = 1;
        int result = 2;
        while (result <= 256) {
            sum = sum + result;
            result = result * 2;
        }
        System.out.println(sum);
    }

    //11)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

    public static void withoutMultiplication() {
        int numberA = 4;
        int numberB = 4;
        int result = 0;
        while (numberB > 0) {
            result = result + numberA;
            numberB--;
        }
        System.out.println(result);
    }

    /*12)Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
    для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см */

    public static void inch() {
        int inch = 1;
        double result = 0;
        while (inch <= 20) {
            result = inch * 2.54;
            if (inch == 1)
                System.out.println(inch + " Дюйм равен " + result + " сантиметра.");
            if (inch > 1 && inch < 5)
                System.out.println(inch + " Дюйма равны " + result + " сантиметра.");
            if (inch >= 5)
                System.out.println(inch + " Дюймов равно " + result + " сантиметра.");
            inch++;
        }

    }

    //13)Напишите программу вывода всех четных чисел от 2 до 100 включительно

    public static void even() {
        int number = 1;
        while (number <= 100) {
            if (number % 2 == 0)
                System.out.println(number);
            number++;
        }

    }

    //14)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99

    public static void notEven() {
        int number = 1;
        double result = 0;
        while (number <= 100) {
            if (number % 2 != 0)
                System.out.println(number);
            number++;
        }

    }
}
