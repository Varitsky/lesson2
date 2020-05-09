package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например:        [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Start array:                     ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
        System.out.print("\n" + "Turned to opposite value array:  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.print("\n" + "\n" + "Filled Array:                    ");
        int[] arr8 = new int[8];
        for (int i = 0; i < arr8.length; i++) {
            arr[i + 1] = arr[i] + 3;
            System.out.print(arr[i] + " ");
        }

        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // Пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.print("\n" + "\n" + "Array, where all-less-6 number multiplyed by 2:   ");
        int[] arr6x2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr6x2[i] + " ");
        }
        for (int i = 0; i < arr6x2.length; i++) {
            if (arr6x2[i] < 6)
                arr6x2[i] = arr6x2[i] * 2;
        }
        System.out.print("\n" + "Modificated array:                                ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr6x2[i] + " ");
        }

        //Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами;
        System.out.println("\n" + "\n" + "Empty array with 1 on diagonal");
        int[][] arrDiag = new int[6][6];
        for (int i = 0; i < arrDiag.length; i++) {
            for (int j = 0; j < arrDiag.length; j++) {
                if (i == j)
                    arrDiag[i][j] = 1;
                System.out.print(arrDiag[i][j] + " ");
            }
            System.out.println("");
        }

        //Задать одномерный массив и найти в нем минимальный и максимальный элементы
        // (без помощи интернета);
        System.out.println("\n" + "Max and Min value from this Array: ");
        int[] arrMinMax = new int[]{22, 0, 6, 19, 41, 100, 9, 0, 5, 19, 45};
        int max = arrMinMax[0];
        int min = arrMinMax[0];
        for (int i = 0; i < arrMinMax.length; i++) {
            System.out.print(arrMinMax[i] + " ");
        }
        for (int i = 0; i < arrMinMax.length; i++) {
            if (max < arrMinMax[i]) {
                max = arrMinMax[i];
            }
            if (min > arrMinMax[i])
                min = arrMinMax[i];
        }
        System.out.println("\n" + "Max is [" + max + "] and Min is [" + min + "]");
        //Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.

        checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1});
    }

    public static void checkBalance(int[] array) {
        int sumLeft = 0;        // сумма слева
        int x = 0;              // сдвиг позиции сравнения левой и правой части
        for (int i = 0; i < array.length - 1; i++) {
            sumLeft = sumLeft + array[i];
            int sumRight = 0;   // обнуляем значение суммы справа
            for (int j = array.length - 1; j > x; j--) {
                sumRight = sumRight + array[j];
            }
            x = x + 1;           // каждую итерацию граница сравнения сдвигается к концу массива
            if (sumLeft == sumRight)
                System.out.println("\n"+"True");
        }
    }
}

//
//        int[] arr = new int[]{1, 4, 6, 7, -1};
//        System.out.println("OldArray");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("[" + i + "] >> " + arr[i] + " ");
//        }
//        System.out.println();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter new value: ");
//        int val = scanner.nextInt();
//
//        int[] newArr = new int[arr.length + 1];
//
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
//
//        newArr[newArr.length - 1] = val;
//
//        System.out.println("New array:");
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.println("[" + i + "] >> " + newArr[i] + " ");
//        }
//    }


//        int[][] arr1=new int[][] {{21,55,11},{23,88,11},{12,22,42}};
//        for (int i=0; i < arr1.length;i++) {
//            for (int j=0;j<arr1.length;j++){
//                System.out.print("[" + i + "] >>" + arr1[i][j]+"   ");
//            }
//            System.out.println("");
//
//        }


//        startGame();
//    }
//
//    static void startGame(){
//        System.out.println("Start Game");
//        playGame();
//        System.out.println("End");
//    }
//
//
//    static void playGame() {
//        final int winner = 777;
//        final int superWinner = 999;
//
//        Scanner scanner = new Scanner(System.in);
//        boolean isRunnable;
//
//        do {
//            int[] roundResult = new int[5];
//
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Roll value ...");
//                int value = scanner.nextInt();
//                System.out.println("Rolling...");
//
//                switch (value) {
//                    case winner: {
//                        System.out.println("You are Winner");
//                        roundResult[i] = 100;
//                        break;
//                    }
//                    case superWinner: {
//                        System.out.println("SuperWinner");
//                        roundResult[i] = 110;
//                        break;
//                    }
//                    default: {
//                        System.out.println("looser");
//                        roundResult[i] = 5;
//                    }
//                }
//            }
//
//            System.out.println("Result:");
//            for (int i=0;i<5;i++) {
//                System.out.print("Round #"+(i+1)+"="+roundResult[i] +" ");
//            }
//
//            System.out.println("Do you want play more?");
//            isRunnable = scanner.nextBoolean();
//
//        } while (isRunnable) ;
//
//
//
//
//        }
//
//
//
//
//}
