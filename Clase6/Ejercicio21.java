package Clase6;


import java.util.Scanner;

public class Ejercicio21 {

   /* Contar el número de elementos positivos, negativos y ceros en un array de 5 enteros.
    Los numeros deben ser ingresados por el usuario. Luego, mostrar la cantidad de
    números positivos, negativos y ceros:
    Ej. “Se ingresaron 2 números positivos, 1 número negativo y 1 cero”*/


    public static void main(String args[]){

        int [] numeros = new int [5];
        int ceros = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i <= 4; i ++) {
            numeros [i] = ingresarNro();
            if(numeros [i] == 0) {
                ceros ++;

            } else {
                if (numeros[i]>0) {
                    positivos ++;
                } else { negativos ++;}

            }
        }

        System.out.println("Se ingresaron " + positivos + " positivos, "+ negativos + " negativos y "+ ceros + " cero.");


    }

    public static int ingresarNro(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int nro = input.nextInt();
        return nro;
    }

}
