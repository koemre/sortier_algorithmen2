package org.example;

public class bubblesort {

    public static void main(String[] args){

        int [] array = {20000, 1400, 15000, 640, 56, 500, 50, 1, 467, 8, 9, 90, 40};
        bubblesort probe = new bubblesort(); // methode einbauen // objekt unserer klasse
        probe.bsort(array);
        for (int i = 0; i < array.length; i++) { // array wirklich sortiert
            System.out.print(array[i] + ",");
        }

    }
    public void bsort(int[] array){
        int result = 0;
        for (int i = 0; i < array.length - 1; i++) { // -1 vorletzter wert damit nicht ganz am ende landet

            if (array[i] <= array[i + 1]){ // kein = endlos
                continue;
            }
            result = array[i];
            array[i] = array[i + 1];
            array[i + 1] = result; // hier werden die variabelen geswapt
            bsort(array); // rekursiver aufruf damit die schleife für jeden wert immer weiter durchläuft


        }
    }
}

