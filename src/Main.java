import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        findMaxMinElementArray();
        countEvenOddNumbersOfArray();
        reverseArray();
    }

/*  Напишите программу, которая находит и выводит максимальное и минимальное
значение в массиве целых чисел. Также вычислите индекс этих элементов.  */

    public static void findMaxMinElementArray(){
        int[] mas = new int[10];
        int maxElement = 0;
        int indexMaxElement = 0;
        int minElement = 100;
        int indexMinElement = 0;
        int i = 0;
        for (; i < mas.length; i++) {
            mas[i] = new Random().nextInt(10);
        }
        System.out.println("Task 1. Array: \n" + Arrays.toString(mas));
        i = 0;
        while (i < mas.length) {
            if (maxElement < mas[i]) {
                maxElement = mas[i];
                indexMaxElement = i;
            } else if (minElement > mas[i]) {
                minElement = mas[i];
                indexMinElement = i;
            }
            i++;
        }
        System.out.println("Max element array : [" + indexMaxElement + "] - " + maxElement +
                "\nMin element Array: [" + indexMinElement + "] - " + minElement + "\n");
    }

    /* Напишите программу, которая принимает массив целых чисел и подсчитывает,
сколько четных и сколько нечетных чисел в нем содержится */

    public static void countEvenOddNumbersOfArray(){
        int[] mas = new int[10];
        int i = 0;
        int countEvenNumber = 0;
        int countOddNumber = 0;
        for (; i < mas.length; i++) {
            mas[i] = new Random().nextInt(10);
        }
        System.out.println("Task 2. Array: \n" + Arrays.toString(mas));
        i = 0;
        while(i < mas.length) {
            if(mas[i] % 2 == 0)
                ++countEvenNumber;
            else
                ++countOddNumber;
            i++;
        }
        System.out.println("Amount event number: " + countEvenNumber + "\nAmount odd number: " + countOddNumber + "\n");
    }

    /* Напишите программу, которая принимает массив целых чисел и изменяет его порядок
на обратный. Выведите результат после изменения порядка. */

    public static void reverseArray() {
        int[] mas = new int[10];
        int[] masReverse = new int[10];
        int i = 0;
        int j = 0;
        for (; i < mas.length; i++) {
            mas[i] = new Random().nextInt(10);
        }
        System.out.println("Task 3. Array: \n" + Arrays.toString(mas));
        i = mas.length - 1;
        while(j < masReverse.length) {
            masReverse[j] = mas[i];
            j++;
            i--;
        }
        System.out.println("Reverse array: \n" + Arrays.toString(masReverse));
        j = 0;
        i = 0;
        while(j < masReverse.length) {
            if (masReverse[j] == mas[j]){
                i = 0;
            } else {
                i++;
            }
            j++;
        }
        if (i == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
