package ru.geekbrains.lesson02;

public class Lesson02 {

    public static void main(String[] args) {

//        Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] firstArr =  { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Массив 1 после обработки");
        first(firstArr);
        System.out.println();

//        Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        System.out.println("Массив 2 после обработки");
        int [] secondArr = new int[8];
        second(secondArr);
        System.out.println();

//        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        System.out.println("Массив 3 после обработки");
        int [] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        third(thirdArr);
        System.out.println();

//        Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        System.out.println("Массив 4 после обработки");
        int [][] fourthArr = new int [5][5];
        fourth(fourthArr);
        System.out.println();

//        Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int [] fifthArr = {0, 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -8};
        fifth(fifthArr);
        System.out.println();

//        ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//        если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
//        checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
//        checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

        int [] sixthArr = {2, 2, 2, 1, 2, 2, 10, 1};
        int [] seventhArr = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(sixthArr));
        System.out.println(checkBalance(seventhArr));
        System.out.println();

//    **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
//    или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
//    Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//    Примеры: [ 1, 2, 3 ]
//    при n = 1 (на один вправо) -> [ 3, 1, 2 ];
//    [ 3, 5, 6, 1] при n = -2 (на два влево)-> [ 6, 1, 3, 5 ].
//    При каком n в какую сторону сдвиг можете выбирать сами.



    }

    public static void first(int[] arr){
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        };
    }

    public static void second(int[] arr) {
        int start = 0;
        for (int i=0; i < arr.length; i++){
            arr[i] = start;
            start += 3;
            System.out.print(arr[i] + " ");
        }
    }

    public static void third(int[] arr) {
        final int six = 6;
        for (int i=0; i < arr.length; i++){
            if (arr[i] < six)
                arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    public static void fourth(int[][] arr) {
        for (int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                arr[i][j] = 0;
                // Высчитываем позицию эл-та на вспомогательной диагонали
                int next = arr[i].length - i - 1;
                if(i == j || j == next)
                    arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fifth(int[] arr) {
        int min = 1;
        int max = 1;
        for (int i=0; i < arr.length; i++){
            if (arr[i] < min)
                min = arr[i];
            else if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Минимальный элемент:" + min);
        System.out.println("Максимальный элемент:" + max);
    }

    public static boolean checkBalance(int[] arr) {
        boolean result = false;

        for (int i=0; i < arr.length; i++){
            int sumLeft = 0;
            int sumRight = 0;
            for (int j=0; j < i; j++){
                sumLeft += arr[j];
            }
            for (int k=i; k < arr.length; k++){
                sumRight += arr[k];
            }
            if (sumLeft == sumRight)
                result = true;
        }

        return result;
    }


}
