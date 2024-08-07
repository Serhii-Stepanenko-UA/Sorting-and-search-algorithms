package app;

import java.util.Arrays;
import static app.ArrayUtils.*;

public class Main {

    public static void main(String[] args) {

        //Створюємо масив випадкових чисел та виводим його
        int[] array = {2, 5, 8, 129, 23, 38, 56, 72, 91, 12, 11, 12, 16, 13, 5, 6, 7};
        System.out.println("\nInput array: " + Arrays.toString(array));

        //Застосовуємо метод сортування злиттям до масиву та виводим відсортований результат.
        mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Викликаємо метод бінарного пошуку для знаходження певного значення у відсортованому масиві та виводимо результат пошуку.
        int target = 13;
//        int target = 555;
        int index = binarySearch(array, target);
        if (index != -1) {
            System.out.println("The element " + target + " found by Index " + index);
        } else {
            System.out.println("The element " + target + " is not found in the array");
        }
    }
}
