package app;

public class ArrayUtils {

    // Метод mergeSort(int[] array), що реалізує сортування злиттям
    public static void mergeSort(int[] array, int left, int right) {
        // Список, що містить 2 і більше елементів
        if (left < right) {
            int mid = (left + right) / 2;
            // Рекурсивно сортуємо ліву половину
            mergeSort(array, left, mid);
            // Рекурсивно сортуємо праву половину
            mergeSort(array, mid + 1, right);
            // Зливаємо відсортовані половини
            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Створюємо тимчасові підмасиви
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Копіюємо дані в тимчасові підмасиви
        for (int i = 0; i < n1; ++i)
            L[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[mid + 1 + j];

        // Зливаємо тимчасові підмасиви
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Копіюємо залишки L[], якщо такі є
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Копіюємо залишки R[], якщо такі є
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    //Метод binarySearch(int[] array, int target), що реалізує бінарний пошук.
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Перевіряємо, чи знайшли шукане значення
            if (array[mid] == target) {
                return mid;
            }

            // Якщо шукане значення менше середнього, змінюємо праву границю
            if (array[mid] < target) {
                left = mid + 1;
            }
            // Інакше змінюємо ліву границю
            else {
                right = mid - 1;
            }
        }

        // Якщо шукане значення не знайдено, повертаємо -1
        return -1;
    }
}
