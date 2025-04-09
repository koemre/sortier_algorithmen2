package org.example;


import java.util.Arrays;

public class quicksort {

    public static void main(String[] args){
        quicksort q = new quicksort();
        int [] zuSortieren = {7, 2, 4, 8, 6, 1, 3, 5, 9};
        System.out.println(Arrays.toString(zuSortieren));
        q.quicksort(zuSortieren, 0, 8);
        System.out.println(Arrays.toString(zuSortieren));
    }





// 2 methoden eine für teilung (sortiert liste pivot links kleiner rechts größer) und eine für quicksort
    public int teilung(int liste[], final int erstes, final int letztes){
        // median des arrays bei 9 ist es 4 durch abrunden nicht 4,5
        int pivot = liste[(erstes+letztes)/2];

        // zeigt auf erstes element der liste
        int positionLinks = erstes;

        // zeigt auf letztes element der liste
        int positionRechts = letztes;


        while (positionLinks <= positionRechts){
            // elemente auf der linken seite kleiner als pivot elemenent, erhöhe die position
            while(liste[positionLinks] < pivot){
                positionLinks++;
            }
            //solange elemente auf der rechten seite größer als pivot, verringere position
            while(liste[positionRechts] > pivot){
                positionRechts--;
            }
            // tausche elemente
            // 1. tmp hält wert von linken seite
            // 2. wert links auf der rechten seite geswapt
            // 3. wert rechten seite auf tmp geändert
            // 4. linke seite um eins weiter (positionLinks++)
            // 5. rechte seite eins zurück (positionRechts--)

            if(positionLinks <= positionRechts){
                int tmp = liste[positionLinks]; // z.B 8
                liste[positionLinks] = liste[positionRechts];
                liste[positionRechts] = tmp; // 8 mit 1
                positionLinks++;
                positionRechts--;
            }
        }

        return positionLinks;
    }

    public void quicksort(int liste[], final int erstes, final int letztes){
        // 7 2 4 8 6 1 3 5 9

        // 5 2 4 3 1 6 8 7 9
        // 0 1 2 3 4 5 6 7 8

        // aufteilung array in zwei seiten
        // linke seite kleiner als pivot, rechte seite größer als pivot
        int index = teilung(liste, erstes, letztes);

        if (erstes < index -1){
            quicksort(liste, erstes, index - 1);
        }

    }

}
