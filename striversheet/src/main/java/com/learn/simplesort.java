package com.learn;

public class simplesort<T extends Comparable<T>> {
    public T[] selection_sort(T arr[]) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[min].compareTo(arr[j]) > 0) {
                    min = j;
                }
            }
            if (i != min)
                swap(arr, min, i);

        }

        return arr;
    }

    public T[] instertion_sort(T arr[]) {

        for (int i = 1; i < arr.length; i++) {
            T Key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(Key) > 0) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j + 1] = Key;

        }

        return arr;
    }

    public T[] Bubble_sort(T arr[]) {
        int len = arr.length;
        for (int i = len - 1; i > 0; i--) {
            boolean s = false;
            for (int j = 0; j < i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                    s = true;
                }

            }
            if (!s) {
                return arr;
            }

        }

        return arr;
    }

    private void swap(T a[], int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
