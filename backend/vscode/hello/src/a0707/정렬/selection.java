package a0707.정렬;

public class selection {
    public static void selection_sort(int[] a) {
        selection_sort(a, a.length);
    }

    public static void selection_sort(int[] a, int size) {
        for (int i = 0; i < size - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < size; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }
            swap(a, min_index, i);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
