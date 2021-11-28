package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateValues {


    public static void main(String[] args) {
        System.out.println("Добрый день, введите пожалуйста целое число, которое будет длинной массива");
        int lght = arrayLength();
        int[] array = consistArray(lght);
        int maximum = resultMaximum(array);
        int minimum = resultMinimum(array);
        double average = resultAverage(lght, array);
        System.out.println("Наш масив:" + Arrays.toString(array));
        System.out.println("Максимальное значение в массиве:" + maximum);
        System.out.println("Минимальное значение в массиве:" + minimum);
        System.out.println("Среднее арифметическое значение элементов массива:" + average);
    }


    private static double resultAverage(int lght, int[] array) {
        double result = 0;
        for (int x: array) {
            result += x;
        }
        result /= lght;
        return result;
    }


    private static int resultMinimum(int[] array) {
        int min = array[0];
        for (int massif : array) {
            if (min > massif)
                min = massif;
        }
        return min;
    }



    private static int resultMaximum(int[] array) {
        int max = array[0];
        for (int massif: array) {
            if (max < massif)
                max = massif;
        }
        return max;
    }

    private static int[] consistArray(int lght) {
        int[] massif = new int[lght];
        for (int index = 0; index < lght; index ++) {
            massif[index] = (int) (Math.random()*1000);
        }
        return massif;
    }

    private static int arrayLength() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println("Ожидается целое число");
            scanner.next();
        }
        return scanner.nextInt();
    }


    }

