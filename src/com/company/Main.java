package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] massiv = {1.2, -2.2, 11, -5, 13, 5.4, 2, 3, 4, -9, -2, 1.3, 2.2, 4.1, 3.2};
        double summa =0;
        int kolvo = 0;
        boolean proverka = false;
        for ( double element:massiv ) {
            if (element < 0) {
                proverka = true;
            }
            if (proverka == true && element > 0) {
                summa +=element;
                kolvo ++;
            }
        }
        System.out.println(summa/kolvo);

        boolean isSorted = false;
        double buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < massiv.length-1; i++) {
                if(massiv[i] > massiv[i+1]){
                    isSorted = false;

                    buf = massiv[i];
                    massiv[i] = massiv[i+1];
                    massiv[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(massiv));

    }
}

