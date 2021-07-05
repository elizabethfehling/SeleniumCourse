package Clase3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();

        int doble = Calculardoble(num1);
        System.out.println("El doble del numero dado es "+ doble);


    }

    public static int Calculardoble (int num1){
        return num1 * 2;
    }
}
