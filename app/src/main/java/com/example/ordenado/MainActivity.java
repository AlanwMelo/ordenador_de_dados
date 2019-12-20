package com.example.ordenado;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Integer[] listaOriginal;
    Integer[] listaBubble;
    Integer[] listaShell;
    Integer[] listaHeap;
    final BubbleSort bubbleSort = new BubbleSort();
    final ShellSort shellSort = new ShellSort();
    final HeapSort heapSort = new HeapSort();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BTGeraLista = findViewById(R.id.btGeraLista);
        Button BtBubbleSort = findViewById(R.id.btIbubbleSort);
        Button BtShellSort = findViewById(R.id.btShellSort);
        Button BtHeapSort = findViewById(R.id.btHeapSort);
        Button VerListaOriginal = findViewById(R.id.verListaOriginal);
        Button VerListaBubble = findViewById(R.id.verListaBubble);
        Button VerListaShell = findViewById(R.id.verListaShell);
        Button VerListaHeap = findViewById(R.id.verHeapSort);
        final TextView TextExibeLista = findViewById(R.id.textExibeLista);


        BTGeraLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickGera();
            }
        });
        VerListaOriginal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextExibeLista.setText(Arrays.toString(listaOriginal));
            }
        });
        VerListaShell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextExibeLista.setText(Arrays.toString(listaShell));
            }
        });
        VerListaBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextExibeLista.setText(Arrays.toString(listaBubble));
            }
        });
        VerListaHeap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextExibeLista.setText(Arrays.toString(listaHeap));
            }
        });

        BtBubbleSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bubbleSort.bubbleSort(listaBubble, getApplicationContext());
            }
        });
        BtHeapSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listaHeap = (heapSort.heapsort(listaHeap, getApplicationContext()));
            }
        });
        BtShellSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shellSort.shellSort(listaShell, getApplicationContext());
            }
        });
    }

    void clickGera() {
        Integer array[] = new Integer[50000];
        Integer array2[] = new Integer[50000];
        Integer array3[] = new Integer[50000];
        Integer array4[] = new Integer[50000];
        Random r = new Random(50000);
        for (int i = 0; i < 50000; i++) {
            int x = r.nextInt();
            array[i] = x;
            array2[i] = x;
            array3[i] = x;
            array4[i] = x;
        }
        listaOriginal = array;
        listaBubble = array2;
        listaShell = array3;
        listaHeap = array4;
        Toast.makeText(getApplicationContext(), "Lista gerada", Toast.LENGTH_LONG).show();
    }
}
