package com.example.ordenado;

import android.content.Context;
import android.widget.Toast;

public class ShellSort {

    public Integer[] shellSort(Integer [ ] a, Context context)
    {
        long startTime = System.nanoTime();

        for( int p = 1; p < a.length; p++ )
        {
            Comparable tmp = a[ p ];
            int j = p;

            for( ; j > 0 && tmp.compareTo( a[ j - 1 ] ) < 0; j-- )
                a[ j ] = a[ j - 1 ];
            a[ j ] = (Integer) tmp;
        }

        long endTime = System.nanoTime();
        String duration = "Ordenado com Shell em: "+(endTime - startTime)/0.000001 + " ns";
        Toast.makeText(context, duration, Toast.LENGTH_LONG).show();

    return a;
    }
}
