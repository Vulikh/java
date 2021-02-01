package ru.geekbrains.lesson01;

public class lesson01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(first());
        System.out.println(second(12, 3));
        System.out.println(second(5, 4));
        System.out.println(second(19, 2));
        third(2);
        third(-3);
        third(0);
        System.out.println(fourth(1));
        System.out.println(fourth(-1));
        System.out.println(fourth(0));
        fifth("Ходор");
        System.out.println(isLeap(1600));
        System.out.println(isLeap(2400));
        System.out.println(isLeap(1700));

    }

    /*
    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.
    */

    public static float first(){

        float a, b, c, d;
        a = 1.0f;
        b = 2.3f;
        c = 4.2f;
        d = 0.2f;

        return a * (b * (c / d));
    }

    /*
    Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
    */

    public static boolean second(int a, int b){
        return a + b >= 10 & a + b <= 20;
    }

    /*
    Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
    */


    public static void third(int a){
        if(a >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");

    }

    // Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    public static boolean fourth(int a){

        return a < 0;

    }

    // Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен
    // вывести в консоль сообщение «Привет, указанное_имя!».

    public static void fifth(String name){
        System.out.println("Привет, " + name + "!");
    }

    // *Написать метод, который определяет, является ли год високосным,
    // и выводит сообщение в консоль. Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean isLeap(int year){
        if(year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

}
