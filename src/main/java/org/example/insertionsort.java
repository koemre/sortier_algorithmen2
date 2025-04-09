package org.example;

public class insertionsort {

    // insertion sort gut für kleine datenmenge

    public static void main(String[] args){

        int array[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionSort(array);

        for (int i: array) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > tmp){
                array[j + 1] = array[j];
                j--;

            }
            array[j + 1] = tmp;

        }
    }
}
