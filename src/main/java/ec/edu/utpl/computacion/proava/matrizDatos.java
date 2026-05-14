package ec.edu.utpl.computacion.proava;

import java.io.IOException;
import java.util.*;
import java.io.*;

public class matrizDatos extends Thread{

    new Thread fila0 = new Thread("Hilo-0");
    new Thread fila1 = new Thread("Hilo-1");
    new Thread fila2 = new Thread("Hilo-2");

    new Thread col0 = new Thread("Col0");
    new Thread col1 = new Thread("Col1");
    new Thread col2 = new Thread("Col2");

    fila0.join();
    fila1.join();
    fila2.join();

    col0.start();
    col1.start();
    col2.start();

    try{
        Thread.sleep(1000);
    }catch(InterruptedException){}


}
