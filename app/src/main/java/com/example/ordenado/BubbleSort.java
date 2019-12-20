package com.example.ordenado;

import android.content.Context;
import android.widget.Toast;

public class BubbleSort {

    public Integer[] bubbleSort(Integer[] a, Context context) {
        int temp;

        long startTime = System.nanoTime();

        for (int i = a.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }

        }

        long endTime = System.nanoTime();
        String duration = "Ordenado com Bubble em: "+(endTime - startTime)/0.000001 + " ns";
        Toast.makeText(context, duration, Toast.LENGTH_LONG).show();
        return a;
    }
}
