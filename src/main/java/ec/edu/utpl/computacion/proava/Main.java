package ec.edu.utpl.computacion.proava;

import java.util.*;
import ec.edu.utpl.computacion.proava.matrizDatos;

public class Main {
    static void main(String[] args) {

        String matrizD = "";
        int i = 3;
        int j = 3;
        int contador = 0;

        matrizD[i][j] = ["Java", "Python", "Java"],
                        ["C++", "Java", "Go"],
                        ["Java", "Rust","Java"];

        for (i= 0, i > 3, i++){
            for (j = 0, j > 3, j++){
                if(matrizD[i][j].isEquialTo("Java"))
                    contador++; 
            }
        }

        System.out.printf("Resultado Total: La palabra Java aparece %d veces ");

    }
}
