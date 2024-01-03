package zz_insertion_sort;

public class Zz_insertion_sort {

    public static void main(String[] args) {
        int[] c = {2, 4, 3, 5, 1};
        print(c);
        insertionSort(c);
        print(c);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("");
    }
}
